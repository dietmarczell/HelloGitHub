
public class Bruch { // ACHTUNG: Zähler und Nenner sind versehentlich vertauscht worden!

	private int Nenner;
	private int Zaehler;
	public static int Counter = 0;
	
	public Bruch (int gotNenner, int gotZaehler)
	{
		this.Nenner = gotNenner; 
		this.Zaehler = gotZaehler;
		Counter++;
	}
	
	public int getNenner()
	{
		return Nenner;
	}
	
	public int getZaehler()
	{
		return Zaehler;
	}	
	
	public double toDecimal ()
	{
		return (Nenner*1.0)/Zaehler;
	}
	
	public void print()
	{
		System.out.println(Nenner+" / "+Zaehler);
	}
	
	public Bruch multiplicate(Bruch b2)
	{
		//return new Bruch(this.Nenner * b2.getNenner(),this.Zaehler * b2.getZaehler()); // Kürzeste Lösung
		Bruch erg = new Bruch(this.Nenner * b2.getNenner(),this.Zaehler * b2.getZaehler());
		erg.print();
		return erg;
	}
	
	public Bruch multiplicate(Bruch b2, Bruch b3)
	{
		//return new Bruch(this.Nenner * b2.getNenner() * b3.getNenner(),this.Zaehler * b2.getZaehler() * b3.getZaehler()); // Kürzeste Lösung
		Bruch erg = new Bruch(this.Nenner * b2.getNenner() * b3.getNenner(),this.Zaehler * b2.getZaehler() * b3.getZaehler());
		erg.print();
		return erg;
	}
	
	public Bruch kuerzen ()
	{
		Bruch erg = new Bruch(this.Nenner,this.Zaehler);
		for (int j=0; j<5; j++)
		{
		  for (int i = 2; i<30; i++) 
		  {
			if ((this.Nenner%i==0) && (this.Zaehler%i==0))
			{
				erg.Nenner=this.Nenner/i;
				erg.Zaehler=this.Zaehler/i;
			}
		  }
		}
		erg.print();
		return erg;
	}
}
