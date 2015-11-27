
public class DemoBruch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bruch b2 = new Bruch(5,6);
		b2.print();
		System.out.println(b2.toDecimal());
		
		Bruch b3 = new Bruch(5,3);
		b3.print();
		System.out.println(b3.toDecimal());
		
		b2.multiplicate(b3);
		b3.multiplicate(b2,b3);
		
	}

}
