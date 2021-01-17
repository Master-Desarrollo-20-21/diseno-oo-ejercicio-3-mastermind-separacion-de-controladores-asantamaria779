package mastermind.models;

public class ProposedCombination extends Combination {
	
	public ProposedCombination(String colors) {
		super(colors);
	}	
	
	protected boolean contains(char color, int position) {
		assert position >= 0 && position < Combination.length();
		
		return this.getColor(position) == color;
	}
	
	protected boolean contains(char color) {
		if (this.getColors().contains(String.valueOf(color))) {
			return true;
		}
		return false;
	}
}
