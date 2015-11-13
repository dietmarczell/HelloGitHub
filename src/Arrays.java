
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] punkte = new int[4]; //default initialisierung je nach Typ 0, 0.0 oder ""
		
		for(int i=0;i<punkte.length; i++) {
			punkte[i] = i*4;
			System.out.println("Zahlen: "+punkte[i]);
		}
		
		
		int[] vorgegebenePunkte = {23,15,78,56}; // Initialisierung mit Werten
		String[] vorgegebeneStrings = {"Koarl","Heinz","Klaus"}; //Länge ergibt sich aus default-Werten
		
		for(int i=0;i<vorgegebenePunkte.length; i++) {
			System.out.println("Zahlen: "+vorgegebenePunkte[i]);
		}
		for(int i=0;i<vorgegebeneStrings.length; i++) {
			System.out.println("Zahlen: "+vorgegebeneStrings[i]);
		}
	}

}
