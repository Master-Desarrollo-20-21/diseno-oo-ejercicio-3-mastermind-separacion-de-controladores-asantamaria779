package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.types.Error;
import mastermind.types.Message;
import utils.Console;

public class ProposedCombinationView {
	private final PlayController playController;
	
	public ProposedCombinationView(PlayController playController) {
		this.playController = playController;
	}	
	
	protected String read() {
		String colors;
		do {
			colors = Console.getInstance().readString(Message.PROPOSE_COMBINATION.getMessage());
			if (!this.playController.isCombinationValidLength(colors)) {
				new ErrorView(Error.WRONG_LENGTH_COMBINATION).writeln();
				colors="";
			}
			if (!this.playController.isCombinationValidColors(colors)) {
				new ErrorView(Error.WRONG_COLORS_COMBINATION).writeln(this.playController.getCombinationValidColors());
				colors="";
			}
		} while (colors.isEmpty());
		return colors;
	}
	
	protected void showProposedCombination(int i) {
		assert i >= 0 && i < playController.getMaxAttempts();
		
		Console.getInstance().write(this.playController.getProposedCombination(i));
	}
}
