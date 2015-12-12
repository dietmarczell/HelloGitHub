package bestellverwaltung;

public class bestellung {

	private String Nummer;
	private bestellzeile[] Zeilen;
	
	public bestellung(String nummer, bestellzeile[] zeilen) {
		Nummer = nummer;
		Zeilen = zeilen;
	}

	public String getNummer() {
		return Nummer;
	}

	public bestellzeile[] getZeilen() {
		return Zeilen;
	}
	
	public void printBestellung()
	{
		System.out.println("Bestellnummer:"+Nummer);
		for (int i=0; i<Zeilen.length;i++)
		{
			System.out.print("Zeile "+(i+1)+" - ");
			Zeilen[i].printBestellung();
		}
	}
	
	public double getKosten()
	{
		double kosten=0;
		for (int i=0; i<Zeilen.length;i++)
		{
			kosten=kosten+this.Zeilen[i].getKosten();
		}
		return kosten;
	}
}
