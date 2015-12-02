package Anlage;

public class Anlage {

	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	
	public Anlage (String bezeichnung, double initialWert, int nutzungsdauer){
		this.bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		this.restWert = initialWert;
		this.alter = 0;

	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}

	public double getRestWert() {
		return restWert;
	}

	public int getAlter() {
		return alter;
	}
	
	public void abschreiben() {
		this.alter++;
		if (this.alter <= this.nutzungsdauer) 
		{
			this.restWert = Math.floor(this.initialWert / this.nutzungsdauer  * (this.nutzungsdauer - this.alter));
		}
	}
	
	public void simulate (int maxJahre, int minWert)
	{
		int Jahr=0;
		System.out.println("Ausgangswert="+this.restWert);
		while (Jahr<=maxJahre && this.restWert >= minWert && restWert > 0)
		{
			abschreiben();
			Jahr++;
			System.out.println("Abschreibung "+Jahr+". Jahr, Restwert="+this.restWert);
		}
	}
	
	public Anlage renew(int zusatzWert, int zusatzJahre)
	{
		return new Anlage (this.bezeichnung, this.restWert+zusatzWert, this.nutzungsdauer-this.alter+zusatzJahre);
	}
	
}
