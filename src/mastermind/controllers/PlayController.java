package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.State;

public class PlayController extends Controller {

	protected PlayController(Game game, State state) {
		super(game, state);
	}

	public int getMaxAttempts() {
		return this.getGame().getMaxAttempts();
	}
	
	public int getNumberOfAttempts() {
		return this.getGame().getNumberOfAttempts();
	}

	public String getProposedCombination(int i) {
		assert i>=0 && i < this.getMaxAttempts();
		
		return this.getGame().getProposedCombination(i);
	}
	
	public int getNumberOfBlacks(int i) {
		assert i>=0 && i < this.getMaxAttempts();
		
		return this.getGame().getNumberOfBlacks(i);
	}

	public int getNumberOfWhites(int i) {
		assert i>=0 && i < this.getMaxAttempts();
		
		return this.getGame().getNumberOfWhites(i);
	}
	
	public boolean isCombinationValidColors(String colors) {
		assert colors != null;
		
		return this.getGame().isCombinationValidColors(colors);
	}
	
	public boolean isCombinationValidLength(String colors) {
		assert colors != null;
		
		return this.getGame().isCombinationValidLength(colors);
	}
	
	public int getCombinationLength() {
		return ProposedCombination.length();
	}
	
	public String getCombinationValidColors() {
		return this.getGame().getCombinationValidColors();
	}

	public boolean isWinner() {	
		return this.getGame().isWinner();
	}

	public boolean isGameOver() {		
		return this.getGame().isOver();
	}

	public void checkProposedCombination(String colors) {
		assert colors != null;
		
		ProposedCombination proposedCombination = new ProposedCombination(colors);
		this.getGame().addResult(proposedCombination);
		this.getGame().checkWinner();
		this.getGame().increaseNumberOfAttempts();
	}
		
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
		this.getState().next();
	}	
}
