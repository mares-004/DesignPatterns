package Command;

import java.util.Vector;

import javax.swing.JList;

public class PushCommand implements Command{
	
	private VStack stack;
	private Object data;
	private JList JList1;
	

	public PushCommand(VStack stack,Object data,JList JList1) {
		super();
		this.stack = stack;
		this.data = data;
		this.JList1 = JList1;
	}

	

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		stack.push(data);
		JList1.setListData(stack.getStackVector());  // refresh the JList
	}



	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stack.pop();
		JList1.setListData(stack.getStackVector());  // refresh the JList

	}




}
