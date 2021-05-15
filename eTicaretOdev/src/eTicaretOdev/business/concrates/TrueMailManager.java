package eTicaretOdev.business.concrates;

import eTicaretOdev.business.abstracts.TrueMailManagerServices;
import eTicaretOdev.entities.concrates.Product;

public class TrueMailManager implements TrueMailManagerServices {

	@Override
	public boolean sendMail(Product product) {
		System.out.println("Hesabýnýzý doðrulmak için doðrulamayý tamamlayýnýz");
		return true;
	}

}
