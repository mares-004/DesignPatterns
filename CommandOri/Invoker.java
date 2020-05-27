package CommandOri;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Invoker
{
Command com;

LinkedList<Command> CommandHistory = new LinkedList<>();
LinkedList<Command> UndoHistory = new LinkedList<>();

public void SetCommand(Command com)
{
	this.com = com;
}

public void action()
{
	com.excecute();
	CommandHistory.add(com);
}

public void undo()
{
	com = CommandHistory.removeLast();
	com.undo();
	UndoHistory.add(com);
	
}
public void redo()
{
	com.excecute();
	CommandHistory.add(com);
}


}
