package State;

public class Shift3 implements State
{
	
	private State next = new Shift4(this);
	private State previous;
	private int gear = 3;
	
	public Shift3(State previous) {
		this.previous = previous;
	}
	
	public State getState() {
		return this;
	}
	
	
	@Override
	public int shift(int speed) {
//		if( speed > 55 || speed <= 10)
//			gear = -1;
//		if (speed > 10 && speed <= 20)
//			gear = previous.shift(speed);
//		if ( speed > 40 && speed <= 55)
//			gear = next.shift(speed);
		
		if (speed > 10 && speed <= 20)
		gear = previous.shift(speed);
		if (speed >= 20 && speed <= 40)
		gear = 3;		
	if ( speed > 40)
		gear = next.shift(speed);

		
		return gear;
	}

}
