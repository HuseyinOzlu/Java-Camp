package eTicaretOdev;


import eTicaretOdev.business.abstracts.LogInServices;
import eTicaretOdev.business.abstracts.SýgnUpServices;
import eTicaretOdev.business.concrates.LogInManager;
import eTicaretOdev.business.concrates.SýgnUpManager;
import eTicaretOdev.core.OAuthAdapterManager;
import eTicaretOdev.entities.concrates.LogIn;
import eTicaretOdev.entities.concrates.Product;
import eTicaretOdev.googleOAuth.GoogleOAuthManager;

public class Main {
	public static void main(String[] args) {
	
	

	
	Product product = new Product(1,"Hüseyin","Ozlu","hozlu509@gmail.com", 123456);
	
	SýgnUpServices sýgnUpServices = new SýgnUpManager();
	sýgnUpServices.add(product);
	
	System.out.println("-----------");
	
	LogIn logIn = new LogIn();
	logIn.setMail("hozlu509@gmail.com");
	logIn.setPasswd(123456);
	
	LogInServices logInService = new LogInManager();
	logInService.logIn(product, logIn);
	
	System.out.println("-------------");
	
	GoogleOAuthManager googleOAuth = new GoogleOAuthManager(1,"Hüseyin","Ozlu","hozlu509@gmail.com", 123456);
	OAuthAdapterManager oAuthAdapter = new OAuthAdapterManager();
	oAuthAdapter.signUp(googleOAuth);
	
	
	
	
	
	
}}