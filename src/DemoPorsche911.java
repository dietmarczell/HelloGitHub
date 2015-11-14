
public class DemoPorsche911 {

	public static void main(String[] args) {
		int n;
		Car porsche911 = new Car();
		porsche911.Color = "rot";
		porsche911.Brand = "Porsche";
		porsche911.CurrentGear = 5;
		porsche911.CurrentSpeed = 300;
		
		Car VWPolo = new Car();
		VWPolo.Brand = "Volkswagen";
		VWPolo.Color = "schwarz";
		VWPolo.CurrentGear = 6;
		VWPolo.CurrentSpeed = 200;
		
		Waehrung Franken = new Waehrung();
		Franken.Betrag = 5000;
		Franken.Zeichen = "CHR";
		
		System.out.println("Auto der Marke "+porsche911.Brand+" und Farbe "+porsche911.Color);
	}
	
}
