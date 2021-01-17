package mastermind.models;

import mastermind.types.StateValue;

public class State {
	
    private StateValue stateValue;

    public State() {
        this.reset();
    }

    protected void reset() {
        this.stateValue = StateValue.INITIAL;
    }

    public void next() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
    }

	public void previous() {
		this.stateValue = StateValue.values()[this.stateValue.ordinal() - 1];		
	}
	
    public StateValue getValueState() {
        return this.stateValue;
    } 
}
