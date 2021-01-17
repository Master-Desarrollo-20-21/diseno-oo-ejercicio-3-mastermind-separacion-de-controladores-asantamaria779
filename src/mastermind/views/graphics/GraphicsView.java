package mastermind.views.graphics;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;

public class GraphicsView extends View {
	
	private final StartView startView;
	private final PlayView playView;
	private final ResumeView resumeView;

	public GraphicsView() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    public void visit(PlayController playController) {
        this.playView.interact(playController);
    }

    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
}
