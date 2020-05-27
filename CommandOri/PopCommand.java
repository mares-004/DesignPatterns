package CommandOri;

import javax.swing.JList;
import java.util.Vector;

public class PopCommand implements Command
{
	
	VStack stack;
	private JList JList1;
	private Object data;

	
	public PopCommand(VStack stack,JList JList1)
	{
		super();
		this.stack = stack;
		this.JList1 = JList1;
		
	}
	
	public void excecute()
	{
		data = stack.pop();
		JList1.setListData(stack.getStackVector());
		
	}

	@Override
	public void undo()
	{
		stack.push(data);
		JList1.setListData(stack.getStackVector());
		
	}

}
