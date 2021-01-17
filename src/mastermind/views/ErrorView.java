package mastermind.views;

import mastermind.types.Error;

public abstract class ErrorView {
	
	private final Error error;
	
	protected ErrorView (Error error) {
		assert error != null;
		
		this.error = error;
	}
	
	protected Error getError() {
		return this.error;
	}
	
	protected String getErrorMessage() {
		return this.error.getMessage();
	}
}
