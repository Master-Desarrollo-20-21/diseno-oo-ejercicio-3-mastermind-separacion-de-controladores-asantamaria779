package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;
import mastermind.types.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
	
	private final StateValue[] stateValues = {StateValue.INITIAL,StateValue.IN_GAME,
											  StateValue.RESUME,StateValue.EXIT};
	private final Game game;
	private final Map<StateValue,Controller> controllers;
	private final State state;
	
	public Logic() {
		this.game = new Game();
		this.state = new State();
		this.controllers = new HashMap<>();
		final Controller[] setControllers = {new StartController(this.game, this.state),
											 new PlayController(this.game, this.state),
											 new ResumeController(this.game, this.state)};
		for(int i=0; i<setControllers.length;i++) {
			controllers.put(stateValues[i],setControllers[i]);
		} 
		this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
        this.controllers.put(StateValue.IN_GAME, new PlayController(this.game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);				
	}
	
	public Controller getController() {
		return this.controllers.get(this.state.getValueState());
	}
}
