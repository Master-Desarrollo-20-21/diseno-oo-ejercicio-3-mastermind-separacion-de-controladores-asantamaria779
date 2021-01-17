package mastermind.views;

import mastermind.models.Game;

public class WithGameView {

	protected final Game game;

	public WithGameView(Game game) {
		assert game != null;
		
		this.game = game;
	}
}
