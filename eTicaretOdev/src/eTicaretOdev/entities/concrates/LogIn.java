package eTicaretOdev.entities.concrates;

import eTicaretOdev.entities.abstracts.LogInService;

public class LogIn implements LogInService{
	private String mail;
	private int passwd;
	
	public LogIn() {
		
	}
	public LogIn(String mail, int passwd) {
		super();
		this.mail = mail;
		this.passwd = passwd;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPasswd() {
		return passwd;
	}
	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}
	@Override
	public void logIn(LogIn logIn) {
		// TODO Auto-generated method stub
		
	}

}
