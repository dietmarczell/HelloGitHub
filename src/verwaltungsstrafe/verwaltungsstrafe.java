package verwaltungsstrafe;

public class verwaltungsstrafe {

	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe;
	private byte anzahl;
	
	public verwaltungsstrafe(String vorname, String nachname, String kennzeichen) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public int getStrafnummer() {
		return strafnummer;
	}

	public byte getAnzahl() {
		return anzahl;
	}
	
	public void strafe(int geschwindigkeitsueberschreitung)
	{
		if (geschwindigkeitsueberschreitung < 20)
		{
			this.strafe = this.strafe + 30;
		}	
		else if (geschwindigkeitsueberschreitung >= 20 && geschwindigkeitsueberschreitung < 30)
		{
			this.strafe = this.strafe + 50;			
		}
		else if (geschwindigkeitsueberschreitung >= 30 && geschwindigkeitsueberschreitung < 50)
		{
			this.strafe = this.strafe + 100;			
		}
		else if (geschwindigkeitsueberschreitung >= 50 && geschwindigkeitsueberschreitung < 100)
		{
			this.strafe = this.strafe + 500;			
		}
		else if (geschwindigkeitsueberschreitung > 100)
		{
			this.strafe = this.strafe + 1500;			
		}
		this.anzahl++;
	}
	
	public void verbandspaket()
	{
		this.strafe = this.strafe + 25;
		this.anzahl++;
	}
	
	public void alkohol(double promille)
	{
		if (promille > 0.5 && promille <= 1.0)
		{
			this.strafe = this.strafe + 100;	
		}
		else if (promille > 1.0 && promille <= 2.0)
		{
			this.strafe = this.strafe + 400;	
		}
		else if (promille > 2.0 && promille <= 3.0)
		{
			this.strafe = this.strafe + 1000;	
		}
		else if (promille > 3.0)
		{
			this.strafe = this.strafe + 5000;	
		}
		this.anzahl++;
		this.anzahl++;
	}

	public void sonstiges(double wert)
	{
		strafe = strafe + wert;
	}
	
	public void getStrafe()
	{
		double minStrafe = this.strafe;
		if (anzahl == 3)
		{
			minStrafe = this.strafe * 0.9;
		}
		else if (anzahl == 2)
		{
			minStrafe = this.strafe * 0.8;
		}
		else if (anzahl == 1)
		{
			minStrafe = this.strafe * 0.7;
		}
		System.out.println(minStrafe);
	}
}
