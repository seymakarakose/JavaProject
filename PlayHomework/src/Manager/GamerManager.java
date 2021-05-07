package Manager;

import Entities.Gamer;
import Interface.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi. "+ gamer.getFirstName());
	  
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi. "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�cellendi."+ gamer.getFirstName());
		
	}
		
		
	}
