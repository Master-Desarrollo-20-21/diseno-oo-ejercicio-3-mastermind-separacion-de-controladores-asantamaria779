package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;

public class ConsoleView extends View {
	
	private final StartView startView;
	private final PlayView playView;
	private final ResumeView resumeView;

	public ConsoleView() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

    public void visit(StartController startController) {
    	assert startController != null;
    	
        this.startView.interact();
    }

    public void visit(PlayController playController) {
    	assert playController != null;
    	
        this.playView.interact(playController);
    }

    public void visit(ResumeController resumeController) {
    	assert resumeController != null;
    	
        this.resumeView.interact(resumeController);
    }
}