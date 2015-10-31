
public class Metropolis {

	public static void main(String[] args) {
		// Metropolen-Erkennung
		int Einwohner = 150_000;
		double MonatseinnahmenProPerson = 2_000;
		boolean Hauptstadt = false;
		
		if (Hauptstadt == true)
			System.out.println("Die Hauptstadt mit "+Einwohner+" Einwohnern und "+MonatseinnahmenProPerson+"€ Monatseinnahmen pro Person ist eine Metropole ? ... "+isMetropolis(Hauptstadt,Einwohner,MonatseinnahmenProPerson));
		else
			System.out.println("Die Stadt mit "+Einwohner+" Einwohnern und "+MonatseinnahmenProPerson+"€ Monatseinnahmen pro Person ist eine Metropole ? ... "+isMetropolis(Hauptstadt,Einwohner,MonatseinnahmenProPerson));
	}
	
	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth)
	{
		double Gesamtsteuern=taxPerPersonAndMonth*inhabitants*12;
		System.out.println("Jahreseinnahmen: " + Gesamtsteuern);
		
		if ((isCapital == true) && (inhabitants > 100_000))
		{
			return true;
		}
		else if ( (inhabitants > 200_000) && (Gesamtsteuern > 720_000_000) )
		{
			return true;
		}
		else
			return false;
	}

}
