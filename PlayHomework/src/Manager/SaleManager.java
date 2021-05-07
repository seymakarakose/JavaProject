package Manager;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Interface.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sales(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adlý oyuncu"+ game.getName()+" oyunu satýn aldý.");
		
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" adlý oyuncu"+ game.getName()+
				"% "+game.getDiscount()+ game.getGamePriceAfterDiscount()+"TL'ye satýn aldý.");
		
	}

}
