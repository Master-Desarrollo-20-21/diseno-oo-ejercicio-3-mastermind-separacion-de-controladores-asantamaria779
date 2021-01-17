package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class StartController extends Controller {

	protected StartController(Game game, State state) {
		super(game, state);
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
        this.getState().next();
	}
}
