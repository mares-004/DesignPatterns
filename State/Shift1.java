package State;

public class Shift1 implements State
{
	State next = new Shift2(this);
	private State previous;
	private int gear = 1;
	
	public Shift1(State previous) {
		this.previous = previous;
	}
	
	public State getState() {
		return this;
	}

	@Override
	public int shift(int speed) {
//		if ( speed > 20)
//			gear = -1;
//		if ( speed == 0)
//			gear = previous.shift(speed);
//		if ( speed > 10 && speed <= 20)
//			gear = next.shift(speed);

		if ( speed == 0)
		gear = previous.shift(speed);
		if ( speed >= 0 && speed <= 10)
			gear = 1;
			
	if ( speed > 10)
		gear = next.shift(speed);
		
		return gear;
	}
}
