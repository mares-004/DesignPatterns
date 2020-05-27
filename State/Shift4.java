package State;

public class Shift4 implements State
{

	private State next = new Shift5(this);
	private State previous;
	private int gear = 4;
	
	public Shift4(State previous) {
		this.previous = previous;
	}
	
	public State getState() {
		return this;
	}
	@Override
	public int shift(int speed) {
//		if ( speed  <= 20)
//			gear = -1;
		if ( speed > 20 && speed <= 40)
			gear = previous.shift(speed);
		if ( speed >= 40 && speed <= 50)
			gear = 4;		
		if( speed > 50)
			gear = next.shift(speed);
		return gear;
	}

}
