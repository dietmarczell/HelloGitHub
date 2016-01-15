package org.campus02.blackjack;

public class DemoBJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blackjack BJ = new Blackjack();
		player test1 = new player("Hans","18");
		System.out.println(BJ.add(test1));
		System.out.println(BJ.toString());
		BJ.addCard(test1, 10);
		System.out.println(BJ.toString());
		System.out.println(BJ.add(test1));
	}

}
