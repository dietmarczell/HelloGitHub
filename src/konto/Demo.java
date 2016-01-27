package konto;

import java.util.ArrayList;
import java.util.HashMap;

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
		
		Konto k1 = new Konto ("Matthias");
		GiroKonto k2 = new GiroKonto("Matthias",1000);
		JugendGiroKonto k3 = new JugendGiroKonto("Matthias", 500, 300);
		
		Konto k4 = new Konto ("Klaus");
		GiroKonto k5 = new GiroKonto("Klaus",1000);
		JugendGiroKonto k6 = new JugendGiroKonto("Klaus", 500, 300);
		
		Konto k7 = new Konto ("Andreas");
		GiroKonto k8 = new GiroKonto("Andreas",1000);
		JugendGiroKonto k9 = new JugendGiroKonto("Andreas", 500, 300);
		
		ArrayList<Konto> klist = new ArrayList<Konto>();
		klist.add(tester_max);
		klist.add(k9);
		klist.add(k8);
		klist.add(k7);
		klist.add(k6);
		klist.add(k5);
		klist.add(k4);
		klist.add(k3);
		klist.add(k2);
		klist.add(k1);
		/*
		for (Konto konto : klist) {
			if(konto.inhaber.equals("Matthias"))
			{	
				System.out.println(konto.toString());
			}
		}
		*/
		HashMap<String, Integer> map_klist = new HashMap<>();
		for (Konto konto : klist) {
			if(!map_klist.containsKey(konto.inhaber))
			{
				map_klist.put(konto.inhaber, 1);				
			}
			else
			{
				int value = map_klist.get(konto.inhaber);
				map_klist.put(konto.inhaber, value+1);
			}
		}
		System.out.println(map_klist.toString());
	}	
}
