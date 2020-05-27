package Command;

import java.util.Vector;

import javax.swing.JList;

public class PopCommand implements Command {

	private VStack stack;
	private JList JList1;
	private Object data;
	
	
	public PopCommand(VStack stack,JList JList1) {
		super();
		this.stack = stack;
		this.JList1 = JList1;
	}



	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		data = stack.pop();
		JList1.setListData(stack.getStackVector()); // refresh the JList
	}



	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stack.push(data);
		JList1.setListData(stack.getStackVector()); // refresh the JList

	}




}
