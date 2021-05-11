package entities;


public class Gamer {
	private	int Id;
	private long nationalityId;
	private String firstName;
	private	int age; 
	private	String lastName;
	
	public Gamer() {
		
	}
	public Gamer(int id, long nationalityId, String firstName, int age, String lastName) {
		super();
		Id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.age = age;
		this.lastName = lastName;
	}
	public int getId() {
		return Id;
	}
	public void setID(int id) {
		Id = id;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
