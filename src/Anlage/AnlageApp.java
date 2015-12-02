package Anlage;

public class AnlageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anlage Laptop = new Anlage("Laptop",2000,5);
		Laptop.simulate(5,500);
		Anlage NewLaptop = Laptop.renew(1000, 4);
		System.out.println("Name:"+NewLaptop.getBezeichnung()+" Wert:"+NewLaptop.getRestWert()+" Nutzungsdauer:"+NewLaptop.getNutzungsdauer());
	}

}
