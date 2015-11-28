
public class DemoBruch {

	public static void main(String[] args) {
		
		// Initialisierung
		System.out.println("Counter: "+Bruch.Counter);
		System.out.println("");
		
		// Bruch 1
		Bruch b2 = new Bruch(5,5);
		System.out.println("Counter: "+Bruch.Counter);
		b2.print();
		System.out.println(b2.toDecimal());
		System.out.println("");
		
		// Bruch 2
		Bruch b3 = new Bruch(5,15);
		System.out.println("Counter: "+Bruch.Counter);
		b3.print();
		System.out.println(b3.toDecimal());
		System.out.println("");
		
		// Multiplizieren und Kürzen
		b2.multiplicate(b3);
		System.out.println("Counter: "+Bruch.Counter);
		b2.multiplicate(b3).kuerzen();
		System.out.println("Counter: "+Bruch.Counter);
		System.out.println("");
		
		b3.multiplicate(b2,b3);
		System.out.println("Counter: "+Bruch.Counter);
		b3.multiplicate(b2,b3).kuerzen();
		System.out.println("Counter: "+Bruch.Counter);
		System.out.println("");
		
		
		// Strings
		String string1 = "Hallo";
		String string2 = "Hallo";
		if ( string1.equals(string2))
		{
			System.out.println("Gleich");
		}
		
		string1 = string1 + "Hallo";
		string2 = string2 + "Hallo";
		if ( string1.equals(string2))
		{
			System.out.println("Gleich");
		}
	}

}
