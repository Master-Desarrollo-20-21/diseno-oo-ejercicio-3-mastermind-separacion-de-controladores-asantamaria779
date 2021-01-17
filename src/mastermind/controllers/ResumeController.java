package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ResumeController extends Controller {

	protected ResumeController(Game game, State state) {
		super(game, state);
	}

	public void reset() {
		this.getGame().reset();
		this.getState().previous();
	}
	
	public void exit() {
		this.getState().next();
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
}
