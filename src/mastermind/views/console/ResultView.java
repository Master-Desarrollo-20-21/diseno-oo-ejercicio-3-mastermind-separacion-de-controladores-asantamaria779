package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.types.Message;
import utils.Console;

public class ResultView {

	protected void showResult(PlayController playController,int i) {
		assert playController != null;
		assert i >= 0 && i < playController.getMaxAttempts();
		
		new ProposedCombinationView(playController).showProposedCombination(i);
		String message = Message.RESULT.getMessage(playController.getNumberOfBlacks(i),
												   playController.getNumberOfWhites(i));
		Console.getInstance().writeln(message);
	}		
}