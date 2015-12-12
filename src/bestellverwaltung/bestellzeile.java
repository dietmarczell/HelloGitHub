package bestellverwaltung;

public class bestellzeile {
	private String Name;
	private int Menge;
	private int Preis;
	
	public bestellzeile(String name, int menge, int preis) {
		Name = name;
		Menge = menge;
		Preis = preis;
	}

	public String getName() {
		return Name;
	}

	public int getMenge() {
		return Menge;
	}

	public int getPreis() {
		return Preis;
	}
	
	public double getKosten()
	{
		return (this.Menge*this.Preis);
	}
	
	public void printBestellung()
	{
		System.out.println("Name:"+this.Name+" Menge:"+this.Menge+" Einzelpreis:"+this.Preis+" Gesamtpreis:"+getKosten());
	}
	
}
