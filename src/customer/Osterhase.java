package customer;

public class Osterhase extends Hase {

	public Osterhase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void ostereier_verteilen()
	{
		System.out.println(this.getName() + " versteckt blaue Eier ...");
	}

	@Override
	public void hoppeln() {
		System.out.println(this.getName() + " hoppelt zum Eierfärben");
	}
	
}
