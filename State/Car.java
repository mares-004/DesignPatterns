package State;


public class Car
{
	public State sp = new Shift0();
	
	
	
    public int changeSpeed(int speed)
    {
    	State state = sp.getState();
    	return state.shift(speed);
    	
    	
    }
}
    
