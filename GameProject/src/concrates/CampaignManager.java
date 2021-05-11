package concrates;

import abstracts.CampaignServices;
import entities.GameCampaign;

public class CampaignManager implements CampaignServices {

	@Override
	public void add(GameCampaign campaign) {
			System.out.println("Kampanya eklendi : " + campaign.getCampaignName());
	}

	@Override
	public void delete(GameCampaign campaign) {
			System.out.println("Kampanya silindi : " + campaign.getCampaignName());
		
	}
	
	
}
