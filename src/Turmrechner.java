public class Turmrechner {

	public static void main(String[] args) 
	{
	// Variable Definieren
	int m = 2;
	int d = 2;
	int zahl = 12;
	int zahl2 = zahl; // Zahl für die Textausgabe
	System.out.println("Die Startzahl lautet "+ zahl);	
	while (m <= 9) // x2 - x9 Rechnen.
	{
		zahl= zahl * m; // Das ergebniss der Berechnung neu in die Variable einlesen 
		System.out.println(zahl2+" * "+m+"= "+zahl); // Text ausgeben
		zahl2 = zahl; // Variable für die Ausgabe der Rechnung nach dem Print für die nächste Ausgabe Updaten
		m++;
	}
	while (d <= 9)
	{
		zahl= zahl / d; // Das ergebniss der Berechnung neu in die Variable einlesen 
		System.out.println(zahl2+" / "+d+"= "+zahl); // Text ausgeben
		zahl2 = zahl; // Variable für die Ausgabe der Rechnung nach dem Print für die nächste Ausgabe Updaten
		d++;
	}
}
}