package State;

public interface State
{
	public int shift(int speed);
	
	public State getState();
}
