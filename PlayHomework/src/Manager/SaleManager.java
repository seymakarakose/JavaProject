package Manager;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Interface.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sales(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adl� oyuncu"+ game.getName()+" oyunu sat�n ald�.");
		
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" adl� oyuncu"+ game.getName()+
				"% "+game.getDiscount()+ game.getGamePriceAfterDiscount()+"TL'ye sat�n ald�.");
		
	}

}
