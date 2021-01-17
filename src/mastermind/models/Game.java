package mastermind.models;

public class Game {

	private final int MAX_ATTEMPTS = 10;
	private int numberOfAttempts;
	private boolean isWinner;	
	private SecretCombination secretCombination;
	private Result[] results;
	
	public Game() {
		this.reset();
	}
	
	public void reset() {
		this.numberOfAttempts=0;
		this.isWinner = false;
		this.secretCombination = new SecretCombination();
		this.results = new Result[this.getMaxAttempts()];
	}
		
	public int getMaxAttempts() {
		return this.MAX_ATTEMPTS;
	}
	
	public String getProposedCombination(int i) {
		assert i>=0 && i < this.getMaxAttempts();
		assert this.results[i] != null;
		
		return this.results[i].getProposedCombinationColors();
	}
			
	public int getNumberOfBlacks(int i) {
		assert i>=0 && i < this.getMaxAttempts();
		assert this.results[i] != null;
				
		return this.results[i].getNumberOfBlacks();
	}

	public int getNumberOfWhites(int i) {
		assert i>=0 && i < this.getMaxAttempts();
		assert this.results[i] != null;
		
		return this.results[i].getNumberOfWhites();
	}
	
	public int getNumberOfAttempts() {
		return this.numberOfAttempts;
	}
	
	public void increaseNumberOfAttempts() {
		this.numberOfAttempts++;		
	}

	public boolean isOver() {
		return this.numberOfAttempts == this.getMaxAttempts() || this.isWinner();
	}
	
	public boolean isWinner() {
		return this.isWinner;
	}

	public boolean isCombinationValidColors(String colors) {
		return this.secretCombination.isValidColors(colors);
	}
	
	public boolean isCombinationValidLength(String colors) {
		return this.secretCombination.isValidLength(colors);
	}	
	
	public void checkWinner() {
		assert this.results[this.getNumberOfAttempts()] != null;
		
		this.isWinner = this.results[this.getNumberOfAttempts()].isWinner();
	}
	
	public String getCombinationValidColors() {
		return this.secretCombination.validColors();
	}
	
	public void addResult(ProposedCombination proposedCombination) {
		assert proposedCombination != null;
		
		Result result = this.secretCombination.check(proposedCombination);
		results[this.getNumberOfAttempts()] = result;
	}
}
