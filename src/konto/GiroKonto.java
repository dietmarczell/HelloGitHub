package konto;

public class GiroKonto extends Konto {

	protected double limit;
	
	public GiroKonto(String inhaber, double limit) {
		super(inhaber);
		this.limit = limit;
	}
	
	@Override
	public void einzahlen(double wert)
	{
		this.kontostand =+ wert;
	}
	
	@Override
	public void auszahlen(double wert)
	{
		double new_konto = this.kontostand;
		
		new_konto =- wert;
		
		if(new_konto < -this.limit)
		{
			System.out.println("Limit zu niedrig für die Transaktion!");
		}
		else
		{
			this.kontostand = new_konto;
		}
	}
}
