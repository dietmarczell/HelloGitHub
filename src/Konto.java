
public class Konto {

	private String Kontoinhaber;
	private double Kontostand;
	
	public Konto(){//String newInhaber){
		//Kontoinhaber = newInhaber;
		Kontostand = 0;
	}
	
	public double getKontostand(){
		return Kontostand;
	}
	
	public void setInhaber(String newInhaber){
		Kontoinhaber = newInhaber;
		Kontostand = 0;
	}
	
	public void aufbuchen (double Zubuchung){
		Kontostand += Zubuchung;
	}
	
	public void abbuchen (double Abbuchung){

		if (Kontostand >= Abbuchung){
			Kontostand -= Abbuchung;
		}
		else{
			System.out.println("Fehler! Zu wenig Geld am Konto!");
		}
	}
}
