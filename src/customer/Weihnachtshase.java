package customer;

public class Weihnachtshase extends Hase {
	
	public Weihnachtshase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void geschenke_verteilen()
	{
		System.out.println(this.getName() + " teilt Geschenke aus ... *Saturn-Schleichwerbung off*");
	}
	
	@Override
	public void hoppeln() {
		System.out.println(this.getName() + " hoppelt zum nächsten Weihnachtsmann-Duell");
	}
}
