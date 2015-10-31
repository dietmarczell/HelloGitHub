
public class RechteckDemo {

	public static void main(String[] args) {
		// gegebenes Rechteck berechnen
		int breite = 5;
		int laenge = 5;
		
		int umfang = 0;
		int flaeche = 0;
		
		umfang = 2*breite + 2*laenge;
		flaeche = breite * laenge;
		
		System.out.println("Berechnung eines Rechtecks mit Breite="+breite+"m und Länge="+laenge+"m");
		System.out.println("Umfang="+umfang+"m Fläche="+flaeche+"m²");
	}

}
