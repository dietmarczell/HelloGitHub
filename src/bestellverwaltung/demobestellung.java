package bestellverwaltung;

public class demobestellung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bestellzeile[] bestellzeilen = new bestellzeile[2];
		
		bestellzeilen[0] = new bestellzeile("Produkt1",5,3);
		//bestellzeilen[0].printBestellung();

		bestellzeilen[1] = new bestellzeile("Produkt2",10,5);
		//bestellzeilen[1].printBestellung();
		
		//bestellung Mueller = new bestellung("AB123456", Zeile1, Zeile2);
		bestellung Mueller = new bestellung("AB123456", bestellzeilen);
		Mueller.printBestellung();
		System.out.println("Gesamtkosten:"+Mueller.getKosten());
	}

}
