package mastermind.models;

import java.util.Random;
import mastermind.types.Color;
import utils.Console; //For tests proposes only

public class SecretCombination extends Combination {
	
	protected SecretCombination() {
		super(makeRandom());
	}
	
	private static String makeRandom() {
		String colors="";
		do {
			char color=Color.validColors().toCharArray()[new Random().nextInt(Color.values().length)];
			if (colors.indexOf(color) == -1) {
				colors+=color;
			}
		} while (colors.length() < Combination.length());
		
		return colors;
	}
		
	protected Result check(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		int numberOfBlacks=0;
		int numberOfWhites=0;
		for (int i=0;i < Combination.length();i++)
			if (proposedCombination.contains(this.getColor(i))) {
				if (proposedCombination.contains(this.getColor(i),i)) {
					numberOfBlacks++;
				} else {
					numberOfWhites++;
				}
			}
		return new Result(proposedCombination,numberOfBlacks,numberOfWhites);
	}
	
	protected String validColors() {
		return Color.validColors();
	}
}
