package GameProject;

import concrates.CampaignManager;
import concrates.GameManager;
import concrates.GamerManager;
import concrates.SaleManager;
import entities.Game;
import entities.GameCampaign;
import entities.Gamer;
import entities.Sale;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setID(1);
		gamer1.setFirstName("Hüseyin");
		gamer1.setLastName("Özlü");
		gamer1.setAge(2002);
		gamer1.setNationalityId(999999999);
		
		GamerManager gamerAdd = new GamerManager();
		gamerAdd.add(gamer1);
		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Efso Oyun");
		game1.setGameCost(100.0);
		
		GameManager gameAdd = new GameManager();
		gameAdd.add(game1);
		
		GameCampaign campaign1 = new GameCampaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Course Campaign");
		campaign1.setDiscountpercent(75.0);
		
		CampaignManager campaignAdd = new CampaignManager();
		campaignAdd.add(campaign1);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setGamer(gamer1);
		sale1.setCampaign(campaign1);
		sale1.setFirstCost(game1.getGameCost());
		sale1.setDiscountPercent(campaign1.getDiscountpercent());

		SaleManager saleManager = new SaleManager();
		saleManager.sale(sale1);
	}
	
	
}
