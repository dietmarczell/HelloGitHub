package verwaltungsstrafe;

public class DemoStrafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verwaltungsstrafe mueller = new verwaltungsstrafe("Hans", "Mueller", "G-234-KT");
		mueller.getStrafe();
		
		
		mueller.alkohol(1.5);
		mueller.getStrafe();
		
		
		mueller.strafe(50);
		mueller.getStrafe();
		
		
		mueller.verbandspaket();
		mueller.getStrafe();
	}

}
