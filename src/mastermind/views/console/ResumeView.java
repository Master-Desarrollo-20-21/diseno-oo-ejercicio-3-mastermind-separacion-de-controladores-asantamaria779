package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.types.Message;

public class ResumeView {

	protected void interact(ResumeController resumeController) {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
		if (isResumed) {
			resumeController.reset();
		} else {
			resumeController.exit();
		}
	}
}
