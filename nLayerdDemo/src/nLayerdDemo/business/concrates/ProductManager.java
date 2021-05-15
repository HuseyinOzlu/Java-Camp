package nLayerdDemo.business.concrates;

import java.util.List;

import nLayerdDemo.business.abstracts.ProductServices;
import nLayerdDemo.core.LoggerService;
import nLayerdDemo.dataAccess.abstracts.ProductDao;
import nLayerdDemo.entities.concretes.Product;

public class ProductManager implements ProductServices{
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
			//iþ kodlarý
			if(product.getCategoryId() == 1 ) {
				System.out.println("Bu kategoride ürün kabul edilmiyor");
				return; // alta asla bakma 
			}
			
			this.productDao.add(product); // Hibernate baðýmlýlýðýmýz yoh 
			this.loggerService.logToSystem("Ürün Eklendi : "+ product.getName());
			
	}		

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
