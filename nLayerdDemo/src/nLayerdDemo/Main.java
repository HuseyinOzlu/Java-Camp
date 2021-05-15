package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductServices;
import nLayerdDemo.business.concrates.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdaptor;
import nLayerdDemo.dataAccess.concretes.abcProductDao;
import nLayerdDemo.entities.concretes.Product;

//concrates özellik tutar//entities iþ yapan sýnýflarý koyarýz
// S.O.L.Ý.D !!!

public class Main {

	public static void main(String[] args) {
			// Entities hariç new liyosak ilerde hata çýkacak.
		
			//TODO: Spring IoC ile çözülecek.
			ProductServices productServices = new ProductManager(new abcProductDao()
					, new JLoggerManagerAdaptor());
			
			// Gerçekte hep interface ile baðlantý kurulur.
			Product product = new Product(1,2,"Elma",12,50);
			productServices.add(product);

	}

}
