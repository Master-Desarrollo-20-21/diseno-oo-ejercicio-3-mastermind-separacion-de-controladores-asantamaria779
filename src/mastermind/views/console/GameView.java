package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.types.Message;
import utils.Console;

public class GameView {
		
	private final ResultView resultView;
	private final SecretCombinationView secretCombinationView;
	private final PlayController playController;
	
	protected GameView(PlayController playController) {
		this.playController = playController;
		this.resultView = new ResultView();
		this.secretCombinationView = new SecretCombinationView();
		
		assert playController != null;
	}

	protected void showGameStatus() {
		final int numberOfAttempts = this.playController.getNumberOfAttempts();
		Console.getInstance().writeln(Message.NUMBER_ATTEMPTS.getMessage(numberOfAttempts));
		this.secretCombinationView.showSecretCombination(this.playController);
		for(int i=0;i<numberOfAttempts;i++) {
			this.resultView.showResult(this.playController,i);
		}
	}
}
