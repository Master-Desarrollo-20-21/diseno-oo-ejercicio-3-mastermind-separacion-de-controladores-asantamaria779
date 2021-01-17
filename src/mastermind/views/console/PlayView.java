package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.types.Message;
import utils.Console;

public class PlayView {
		
	protected void interact(PlayController playController) {
		final GameView gameView = new GameView(playController);
		do {
			gameView.showGameStatus();
			String colors = new ProposedCombinationView(playController).read();
			playController.checkProposedCombination(colors);
		} while (!(playController.isGameOver()));
		gameView.showGameStatus();
		this.showFinalResult(playController);
	}
	
	private void showFinalResult(PlayController playController) {
		if (playController.isWinner()) {
			Console.getInstance().writeln(Message.PLAYER_WIN.getMessage());
		}
		else {
			Console.getInstance().writeln(Message.PLAYER_LOST.getMessage());
		}	
	}
}
