package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public abstract class Controller {
	
	private Game game;
	private State state;
	
	protected Controller (Game game, State state) {
		this.game = game;
		this.state = state;
	}
	
	protected Game getGame() {
		return this.game;
	}
	
	protected State getState() {
		return this.state;
	}
	   
    public abstract void accept(ControllersVisitor controllersVisitor);
}
