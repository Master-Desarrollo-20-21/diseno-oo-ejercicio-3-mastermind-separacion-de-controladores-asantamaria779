package mastermind.types;

public enum Error {

	WRONG_LENGTH_COMBINATION("Wrong proposed combination length"),
	WRONG_COLORS_COMBINATION("Wrong colors, they must be: #rightColors"),
	NULL;

	private String message;

	private Error(){
	}

	private Error(String message){
		assert message != null;
		
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public boolean isNull(){
		return this == Error.NULL;
	}
}