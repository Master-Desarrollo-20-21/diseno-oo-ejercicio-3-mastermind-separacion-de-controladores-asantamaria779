package mastermind.views.console;

import mastermind.types.Error;
import utils.Console;

public class ErrorView extends mastermind.views.ErrorView {
	
	protected ErrorView (Error error) {
		super(error);
	}
	
	protected void writeln(String rightColors) {
		assert this.getError() == Error.WRONG_COLORS_COMBINATION;
		assert rightColors != null;
		
		String message = this.getErrorMessage().replaceAll("#rightColors",rightColors);
		Console.getInstance().writeln(message);
	}

	protected void writeln() {
		if (!this.getError().isNull()) {
			this.writeln(this.getErrorMessage());
		}	
	}	
}
