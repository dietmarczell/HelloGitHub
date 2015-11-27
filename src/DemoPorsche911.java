
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
		
		System.out.println(porsche911.getCurrentGear());
		System.out.println(porsche911.CurrentSpeed);
		porsche911.setCurrentGear(3);
		System.out.println(porsche911.getCurrentGear());
		porsche911.nextGear();
		porsche911.accelerate();
		System.out.println(porsche911.CurrentSpeed);	
		porsche911.accelerate(25);
		System.out.println(porsche911.CurrentSpeed);
		System.out.println(porsche911.getCurrentGear());
		
		
		System.out.println("Auto der Marke "+porsche911.Brand+" und Farbe "+porsche911.Color);
		
		
		Konto Mueller = new Konto("Max Mustermann");
		System.out.println(Mueller.getInhaber()+" - Kontostand:"+Mueller.getKontostand()+"€ ");
		Mueller.setInhaber("Max Mueller");
		System.out.println(Mueller.getInhaber()+" - Kontostand:"+Mueller.getKontostand()+"€ ");
		Mueller.aufbuchen(120.00);
		System.out.println("Kontostand:"+Mueller.getKontostand()+"€ ");
		Mueller.abbuchen(150.00);
		System.out.println("Kontostand:"+Mueller.getKontostand()+"€ ");
	}
	
}
