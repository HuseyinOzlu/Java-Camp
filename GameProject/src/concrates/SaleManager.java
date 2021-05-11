package concrates;

import abstracts.SaleServices;
import entities.Sale;

public class SaleManager implements SaleServices {

	@Override
	public void sale(Sale sale) {
			System.out.println(sale.getGamer().getFirstName()+" " +sale.getGamer().getLastName()+" adlý üyemiz tarafýndan asýl fiyatý " + 
					sale.getFirstCost() + " TL olan " + sale.getGame().getGameName() + " oyunumuzu "
					+ sale.getCampaign().getCampaignName() + "  kampanyasý sebebi ile \n " + sale.getDiscountPercent() + 
					" TL indirim alarak " + (sale.getFirstCost()-sale.getDiscountPercent()) + " TL'ye almýþtýr.");
	}
	
}
