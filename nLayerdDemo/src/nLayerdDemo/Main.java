package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductServices;
import nLayerdDemo.business.concrates.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdaptor;
import nLayerdDemo.dataAccess.concretes.abcProductDao;
import nLayerdDemo.entities.concretes.Product;

//concrates �zellik tutar//entities i� yapan s�n�flar� koyar�z
// S.O.L.�.D !!!

public class Main {

	public static void main(String[] args) {
			// Entities hari� new liyosak ilerde hata ��kacak.
		
			//TODO: Spring IoC ile ��z�lecek.
			ProductServices productServices = new ProductManager(new abcProductDao()
					, new JLoggerManagerAdaptor());
			
			// Ger�ekte hep interface ile ba�lant� kurulur.
			Product product = new Product(1,2,"Elma",12,50);
			productServices.add(product);

	}

}
