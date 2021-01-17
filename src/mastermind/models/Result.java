package mastermind.models;

public class Result {
	
	private final ProposedCombination proposedCombination;
	private final int numberOfBlacks;
	private final int numberOfWhites;
	
	protected Result (ProposedCombination proposedCombination,int numberOfBlacks,int numberOfWhites) {
		assert proposedCombination != null;
		assert numberOfBlacks >=0 && numberOfBlacks <= Combination.length();
		assert numberOfWhites >=0 && numberOfWhites <= Combination.length();
		
		this.proposedCombination = proposedCombination;
		this.numberOfBlacks = numberOfBlacks;
		this.numberOfWhites = numberOfWhites;
	}
		
	protected boolean isWinner() {
		return this.numberOfBlacks==Combination.length();
	}
	
	protected ProposedCombination getProposedCombination() {
		return this.proposedCombination;
	}
	
	protected String getProposedCombinationColors() {
		return this.proposedCombination.getColors();
	}
	
	protected int getNumberOfBlacks() {
		return this.numberOfBlacks;
	}
	
	protected int getNumberOfWhites() {
		return this.numberOfWhites;
	}
}
