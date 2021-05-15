package eTicaretOdev.googleOAuth;



public class GoogleOAuthManager implements GoogleOAuth {
	private int id;
	private String firstName;
	private String lastName;
	private String ePosta;
	private int password;
	

	
	public GoogleOAuthManager(int id, String firstName, String lastName, String ePosta,int password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	

}
