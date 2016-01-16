package customer;

public class person {
	private String firstname;
	private String lastname;
	
	public person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void getInfo()
	{
		System.out.println(this.getFirstname() + " " + this.getLastname());
	}
	
	
}
