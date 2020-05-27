package State;

public class Shift2 implements State
{
	State next = new Shift3(this);
	private State previous;
	private int gear = 2;
	
	public Shift2(State previous) {
		this.previous = previous;
	}
	
	public State getState() {
		return this;
	}

	@Override
	public int shift(int speed) {
//		if( speed > 40 )
//			gear = -1;
//		if ( speed > 0 && speed <= 10)
//			gear = previous.shift(speed);
//		if ( speed > 20 && speed <= 40)
//			gear = next.shift(speed);

		if ( speed > 0 && speed <= 10)
		gear = previous.shift(speed);
		if ( speed >= 10 && speed <= 20)
			gear = 2;
	if ( speed > 20)
		gear = next.shift(speed);
		
		return gear;
	}

}
