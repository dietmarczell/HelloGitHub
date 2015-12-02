package Lohnberechnung;

public class DemoLohnberechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lohnberechnung ma2 = new lohnberechnung ("hans","mueller",2333.3334);
		System.out.println("Nettolohn:"+ma2.monatsAbrechnung());
		System.out.println("Jahreslohn:"+ma2.jahresAbrechnung());
		System.out.println("Lohn 6 Monate:"+ma2.jahresAbrechnung(6));
	}

}
