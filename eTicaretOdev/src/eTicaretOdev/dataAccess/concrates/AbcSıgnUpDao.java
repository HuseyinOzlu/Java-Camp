package eTicaretOdev.dataAccess.concrates;


import eTicaretOdev.dataAccess.abstracts.SýgnUpDao;
import eTicaretOdev.entities.concrates.Product;

public class AbcSýgnUpDao implements SýgnUpDao {

	@Override
	public void add(Product product) {
			System.out.println("Sisteme kayýt oldu : " + product.getFirstName());
			
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
}
