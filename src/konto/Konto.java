package konto;

public class Konto {

	protected String inhaber;
	protected double kontostand;
	
	
	public Konto(String inhaber) {
		super();
		this.inhaber = inhaber;
		this.kontostand = 0;
	}

	public void einzahlen(double wert)
	{
		this.kontostand =+ wert;
	}
	
	public void auszahlen(double wert)
	{
		this.kontostand =- wert;
	}

	@Override
	public String toString() {
		return "Konto [inhaber=" + inhaber + ", kontostand=" + kontostand + ", toString()=" + super.toString() + "]";
	}

}
