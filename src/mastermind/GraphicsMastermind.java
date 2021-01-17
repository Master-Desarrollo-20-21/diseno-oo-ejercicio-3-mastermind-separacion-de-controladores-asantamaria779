package mastermind;

import mastermind.views.graphics.GraphicsView;

class GraphicsMastermind extends Mastermind {
	
	@Override
	protected GraphicsView createView() {
		return new GraphicsView();
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}
