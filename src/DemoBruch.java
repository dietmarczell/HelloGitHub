
public class DemoBruch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Counter: "+Bruch.Counter);
		Bruch b2 = new Bruch(5,6);
		System.out.println("Counter: "+Bruch.Counter);
		b2.print();
		System.out.println(b2.toDecimal());
		
		Bruch b3 = new Bruch(5,3);
		System.out.println("Counter: "+Bruch.Counter);
		b3.print();
		System.out.println(b3.toDecimal());
		
		b2.multiplicate(b3);
		b3.multiplicate(b2,b3);
		
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
