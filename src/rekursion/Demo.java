package rekursion;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ort graz = new Ort("Graz");
		Ort wien = new Ort("Wien");
		Ort linz = new Ort("Linz");
		Ort marburg = new Ort("Marburg");
		
		graz.addNachbar(wien);
		graz.addNachbar(marburg);
		wien.addNachbar(linz);
		linz.addNachbar(graz);
		marburg.addNachbar(graz);
		wien.addNachbar(graz);
		linz.addNachbar(wien);
		
		System.out.println(hasCircle(graz));
		
		//System.out.println(getHops(graz, linz));
	}
	
	public static boolean hasCircle(Ort o)
	{
		return hasCircle(o,o,o);
	}
	
	private static boolean hasCircle(Ort curr, Ort start, Ort last)
	{
		for (Ort ort : curr.getNachbarn()) 
		{
			System.out.println(ort.getName()+" - "+curr.getName());
			if(ort.equals(last))
			{
				System.out.println("Same way");
				continue;
			}
			if(ort.equals(start))
			{
				return true;
			}
			if (hasCircle(ort, start, curr))
			{
				return true;
			}
		}
		return false;
	}

	/*public static Integer getHops (Ort start, Ort ziel)
	{
		if(start.equals(ziel))
		{
			return counter;
		}
		for (Ort ort : start.getNachbarn()) 
		{
			if(ort.equals(ziel))
			{
				counter++;
				return getHops(ort,ziel);
			}
			if(ort.getNachbarn().contains(ziel))
			{
				counter=counter+2;
				return counter;
			}
		}
		return counter;
	}*/

}
