package eTicaretOdev.business.abstracts;



import eTicaretOdev.entities.concrates.LogIn;
import eTicaretOdev.entities.concrates.Product;

public interface LogInServices {
	
	void logIn(Product product, LogIn logIn);
}
