package konto;

public class SparKonto extends Konto {

	public SparKonto(String inhaber) {
		super(inhaber);
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
		
		if(new_konto < 0)
		{
			System.out.println("Sparkontoüberziehung nicht möglich!");
		}
		else
		{
			this.kontostand = new_konto;
		}
	}
	
}
