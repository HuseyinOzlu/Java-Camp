package concrates;

import abstracts.SaleServices;
import entities.Sale;

public class SaleManager implements SaleServices {

	@Override
	public void sale(Sale sale) {
			System.out.println(sale.getGamer().getFirstName()+" " +sale.getGamer().getLastName()+" adl� �yemiz taraf�ndan as�l fiyat� " + 
					sale.getFirstCost() + " TL olan " + sale.getGame().getGameName() + " oyunumuzu "
					+ sale.getCampaign().getCampaignName() + "  kampanyas� sebebi ile \n " + sale.getDiscountPercent() + 
					" TL indirim alarak " + (sale.getFirstCost()-sale.getDiscountPercent()) + " TL'ye alm��t�r.");
	}
	
}
