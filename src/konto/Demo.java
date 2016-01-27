package konto;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JugendGiroKonto tester_max = new JugendGiroKonto("Max", 1000, 500);
		tester_max.einzahlen(500);
		System.out.println(tester_max.toString());
		tester_max.auszahlen(1000);
		tester_max.auszahlen(500);
		
		Konto konto_max = tester_max;
		System.out.println(konto_max.toString());
		konto_max.auszahlen(50);
		konto_max.einzahlen(1000);
		konto_max.auszahlen(1000);
	}

}
