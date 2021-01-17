package mastermind.views.console;

import mastermind.types.Message;
import utils.Console;

public class StartView {
		
	protected void interact() {
		Console.getInstance().writeln(Message.TITTLE.getMessage());
	}
}
