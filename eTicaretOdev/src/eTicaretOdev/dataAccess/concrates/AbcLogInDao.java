package eTicaretOdev.dataAccess.concrates;

import eTicaretOdev.dataAccess.abstracts.LogInDao;
import eTicaretOdev.entities.concrates.Product;

public class AbcLogInDao implements LogInDao  {
	Product product;
	private String mail = product.getePosta();
	private int pass = product.getPassword();
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	@Override
	public void logIn(Product product) {
		// TODO Auto-generated method stub
		
	}

}
