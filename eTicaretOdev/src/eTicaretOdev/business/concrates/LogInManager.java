package eTicaretOdev.business.concrates ;

import eTicaretOdev.business.abstracts.LogInServices;
import eTicaretOdev.dataAccess.concrates.AbcLogInDao;
import eTicaretOdev.entities.concrates.LogIn;
import eTicaretOdev.entities.concrates.Product;

public class LogInManager implements LogInServices {
	
	AbcLogInDao abcLogInDao; 
	TrueMailManager mailManager;

	@Override
	public void logIn(Product product, LogIn logIn) {
		
		
		if(product.getePosta() != logIn.getMail()){
			System.out.println("Mail adresinizi hatal� girdiniz!!");
		} else if(product.getPassword() != logIn.getPasswd()) {
			System.out.println("�ifrenizi hatal� girdiniz!!");
		}  else {
			System.out.println("Giri� Ba�ar�l�");
		}
	}



}
