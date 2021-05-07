package Interface;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	
	void sales(Game game, Gamer gamer);
	void sellWithCampaign(Game game, Gamer gamer, Campaign campaign);

}
