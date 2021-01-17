package mastermind.types;

public enum Message {
	
	TITTLE("\n---- MASTERMIND -----"),
	RESUME("RESUME"),
	PLAYER_WIN("You've won!!! ;-)"),
	PLAYER_LOST("You've lost!!! :-("),
	NUMBER_ATTEMPTS("\n#numberOfAttempts attempt(s):"),
	PROPOSE_COMBINATION("Propose a combination: "),
	RESULT(" --> #numberOfBlacks blacks and #numberOfWhites whites");
	
	private String message;
	
	private Message(String message) {
		assert message != null;
		
		this.message = message;
	}

	public String getMessage(int numberOfAttempts) {
		assert this == Message.NUMBER_ATTEMPTS;
		
		return this.message.replaceAll("#numberOfAttempts",String.valueOf(numberOfAttempts));
	}
	
	public String getMessage(int numberOfBlacks,int numberOfWhites) {
		assert this == Message.RESULT;
		
		String msg = this.message.replaceAll("#numberOfBlacks",String.valueOf(numberOfBlacks));
		msg = msg.replaceAll("#numberOfWhites",String.valueOf(numberOfWhites));
		return msg;
	}
	
	public String getMessage() {
		return this.message;
	}
}
