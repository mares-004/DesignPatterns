package State;

public class Shift0 implements State
{

		State next = new Shift1(this);
		private int gear = 0;
		
		public State getState()
		{
			return this;
		}

		@Override
		public int shift(int speed)
		{
//			if( speed < 0 || speed > 10)
//				gear = -1;
//			else if( speed > 0 && speed <= 10)
//				gear = next.shift(speed);
			
			if (speed == 0)
				gear = 0;
			if (speed > 0)
			{
				gear = next.shift(speed);
			}
				
			return gear;
		}
		
	}

