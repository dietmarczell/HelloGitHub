package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Zinsen;

public class ZinsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zinsen myZins = new Zinsen (10000,365,2.625);
		System.out.println("Ergebnis:"+myZins.berechnen());
		System.out.println("Ergebnis:"+myZins.berechnen(25000,365,0.5));
	}

}
