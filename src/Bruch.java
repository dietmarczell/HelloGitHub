
public class Bruch {

	private int Nenner;
	private int Zaehler;
	
	public Bruch (int gotNenner, int gotZaehler)
	{
		this.Nenner = gotNenner; 
		this.Zaehler = gotZaehler;
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
		b2.Nenner = Nenner * b2.Nenner;
		b2.Zaehler = Zaehler * b2.Zaehler;
		System.out.println(b2.Nenner+" / "+b2.Zaehler);
		return b2;
	}
	
	public Bruch multiplicate(Bruch b2, Bruch b3)
	{
		b2.Nenner = Nenner * b2.Nenner * b3.Nenner;
		b2.Zaehler = Zaehler * b2.Zaehler * b3.Zaehler;
		System.out.println(b2.Nenner+" / "+b2.Zaehler);
		return b2;
	}
}
