package mastermind.models;

import mastermind.types.Color;

abstract class Combination {
	
	private static final int LENGTH = 4;
	private String colors;
	
	protected Combination(String colors){
		assert colors != null;
		assert this.isValidLength(colors);
		assert this.isValidColors(colors);
		
		this.colors=colors;
	}
	
	protected boolean isValidLength(String colors) {
		assert colors != null;		
		
		return colors.length() == Combination.length();
	}

	public static int length() {
		return LENGTH;
	}
	
	protected boolean isValidColors(String colors) {
		assert colors != null;
		
		for(int i=0;i < colors.length();i++) {
			if (!Color.isValid(colors.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	protected char getColor(int position) {
		return this.colors.charAt(position);
	}
	
	protected String getColors() {
		return this.colors;
	}	
}
