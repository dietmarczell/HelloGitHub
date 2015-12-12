package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myStringList = new ArrayList<String>();
		myStringList.add("Frosch");
		myStringList.add("Tiger");
		myStringList.add("Loewe");
		
		System.out.println(myStringList.size());
		System.out.println("Contains Cow? - "+myStringList.contains("Cow"));
		
		System.out.println(myStringList.size());
		System.out.println("Contains Frosch? - "+myStringList.contains("Frosch"));
		
		myStringList.remove("Frosch");
		
		System.out.println(myStringList.size());
		System.out.println("Contains Frosch? - "+myStringList.contains("Frosch"));
		
		for (String animal : myStringList) {
			System.out.println(animal);
		}		
	}
}


