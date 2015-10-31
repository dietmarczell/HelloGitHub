
public class ZinsDemo {
	public static void main(String[] args) {
		// Zinsberechnung mit eigener Untermethode
		zinsberechnung(2500,2.25);
		zinsberechnung(1000,1.0);
		zinsberechnung(1000,2.25);
		
		// Lösung Prof
		int kontostand = 5000;
		double zinssatz = 1;
		double ergebnis = zinsberechnung_return(kontostand,zinssatz);
		System.out.println(zinssatz+"% Zinsen von "+kontostand+"€ sind "+ergebnis+"€");
		
	}
	
	// Eigene Lösung
	public static void zinsberechnung (int kontostand,double zinssatz)
	{
		double zinsen = kontostand * (zinssatz/100);
		System.out.println(zinssatz+"% Zinsen von "+kontostand+"€ sind "+zinsen+"€"); //+Math.round(zinsen)+"€");
	}
	
	// Lösung Prof
	public static double zinsberechnung_return (int kontostand,double zinssatz)
	{
		return kontostand * (zinssatz/100);
	}
}
