package mastermind.views.console;

import mastermind.controllers.PlayController;
import utils.Console;

public class SecretCombinationView {
	
	protected void showSecretCombination(PlayController playController) {
		assert playController != null;
		
		String combinationEncoded="";
		for (int i=0;i<playController.getCombinationLength();i++) {
			combinationEncoded+='x';
		}
		Console.getInstance().write(combinationEncoded + "\n");
	}
}
