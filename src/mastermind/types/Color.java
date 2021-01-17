package mastermind.types;
	
public enum Color {
	RED ('r'),
	BLUE ('b'),       
	YELLOW ('y'),
	GREEN ('g'),
	ORANGE ('o'),
	PINK ('p');

	private final char color;
	
	private Color(char color) {		
		this.color=color;
	}
	
	public static boolean isValid(char color) {		
		for (Color c : Color.values()) {
			if (c.color == color) return true;
		}		
		return false;
	}
	
	public static String validColors() {
		String validColors="";
		for (Color c : Color.values()) {
			validColors+=c.color;
		}
		return validColors;		
	}
}
	   				