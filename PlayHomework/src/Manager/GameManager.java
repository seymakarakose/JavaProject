package Manager;

import Entities.Game;
import Interface.GameService;

public class GameManager implements GameService  {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi. "+ game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi. "+ game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�cellendi. "+ game.getName());
		
	}
	
}
