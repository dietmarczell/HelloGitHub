package product_mac;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product mainboard = new product("mainboard", 5);
		product ram = new product("ram", 10);
		product mac = new product("Mac", 10);
		
		mac.add(ram);
		mac.add(mainboard);
		
		System.out.println(mac.getPrice());
		
		System.out.println( mac.print() );
	}

}
