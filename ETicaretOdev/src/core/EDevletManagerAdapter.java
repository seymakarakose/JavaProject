package core;

import EDevlet.EDevletManager;

public class EDevletManagerAdapter implements EDevletService {

	@Override
	public void confirmationToSystem(String message) {
		EDevletManager manager = new EDevletManager();
		manager.confirmation(message);
		
		
	}
	

}
