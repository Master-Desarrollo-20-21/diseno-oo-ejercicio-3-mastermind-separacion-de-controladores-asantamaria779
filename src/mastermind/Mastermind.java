package mastermind;

import mastermind.views.View;
import mastermind.controllers.Controller;
import mastermind.controllers.Logic;

abstract class Mastermind {	
	
	private final Logic logic;
	private final View view;
	
	protected Mastermind() {
		this.logic = new Logic();
		this.view = this.createView();
	}
	
	protected abstract View createView();

	protected void play() {
        Controller controller;
		do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
		} while (controller != null);
	}	
}

