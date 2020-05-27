package Command;


import java.util.*;
import java.util.Vector;

public class Invoker {
	
	private Command com;
	private LinkedList<Command> commandHistory = new LinkedList<>();
	private LinkedList<Command> undoHistory = new LinkedList<>();
	
	public void setCommand(Command command) {
		this.com = command;
	}
	
	public void action() {
		com.excecute();
		commandHistory.add(com);
	}
	
	public void undo() {
		com = commandHistory.removeLast();
		com.undo();
		undoHistory.add(com);
	}
	
	public void redo() {
		com.excecute();
		commandHistory.add(com);
	}
	
}
