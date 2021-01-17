package mastermind.views;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

	public void interact(Controller controller) {
		assert controller != null;
		
		controller.accept(this);
	}	
}
