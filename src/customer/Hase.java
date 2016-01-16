package customer;

public class Hase {
	private String Name;
	
	public void hoppeln()
	{
		System.out.println(this.Name + " hoppelt, hoppelt und hoppelt herum");
	}
	
	public void schlafen()
	{
		System.out.println(this.Name + " schläft ... tzzzzz");
	}
	
	public void fressen()
	{
		System.out.println(this.Name + " frisst ... nom nom nom");
	}

	public Hase(String name) {
		super();
		this.Name = name;
	}

	public String getName() {
		return Name;
	}
}
