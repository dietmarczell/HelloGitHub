package product_mac;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product mainboard = new product("mainboard", 5);
		product ram = new product("ram", 5);
		product mac = new product("Mac", 10);
		product chasis = new product("case", 5);
		
		mac.add(chasis);
		mac.add(mainboard);
		
		mainboard.add(ram);
		mainboard.add(ram);
		
		System.out.println(mac.getPrice());
		
		System.out.println( mac.print() );
	}

}
