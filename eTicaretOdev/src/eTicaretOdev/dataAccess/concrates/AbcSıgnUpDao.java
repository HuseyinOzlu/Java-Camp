package eTicaretOdev.dataAccess.concrates;


import eTicaretOdev.dataAccess.abstracts.S�gnUpDao;
import eTicaretOdev.entities.concrates.Product;

public class AbcS�gnUpDao implements S�gnUpDao {

	@Override
	public void add(Product product) {
			System.out.println("Sisteme kay�t oldu : " + product.getFirstName());
			
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
}
