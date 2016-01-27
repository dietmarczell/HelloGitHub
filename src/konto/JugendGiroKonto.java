package konto;

public class JugendGiroKonto extends GiroKonto {

	protected double buchungslimit;
	
	public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
		// TODO Auto-generated constructor stub
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
		
		if(wert > buchungslimit)
		{
			System.out.println("Maximales Buchungslimit überschritten!");
		}
		else if(new_konto < -this.limit)
		{
			System.out.println("Limit zu niedrig für die Transaktion!");
		}
		else
		{
			this.kontostand = new_konto;
		}
	}
}
