package CommandOri;

import javax.swing.JList;

public class PushCommand implements Command
{
	VStack stack;
	JList JList1;
	Object data;

	PushCommand(VStack stack, Object data, JList List1)
	{
		this.stack = stack;
		this.JList1 = List1;
		this.data = data;
	}
	
	@Override
	public void excecute()
	{
		stack.push(data);
		JList1.setListData(stack.getStackVector());
		
	}
	@Override
	public void undo()
	{
		data = stack.pop();
		JList1.setListData(stack.getStackVector());
		
		
	}
	
	
	
	
	

}
