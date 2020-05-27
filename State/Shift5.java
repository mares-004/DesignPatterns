package State;

public class Shift5 implements State
{
		private State previous;
		private int gear = 5;
		
		public Shift5(State previous) {
			this.previous = previous;
		}
		
		public State getState() {
			return this;
		}

		@Override
		public int shift(int speed) {
//			if ( speed <= 40)
//				gear = -1;
			if ( speed > 40 && speed < 50)
				gear = previous.shift(speed);
			return gear;
		}

	}

	


