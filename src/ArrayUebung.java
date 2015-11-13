
public class ArrayUebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] punkte1 = {3,4,5,6,7,8,9,12,436,656,56,5}; 
		int[] punkte2 = {7,1,3,3,4,5,6,56,4,6,1,2};
		int[] ergebnisAddition = new int[punkte1.length];
		int[] ergebnisMultiplikation = new int[punkte1.length];
		
		for(int i=0 ; i < punkte1.length ; i++) {
			ergebnisAddition[i] = punkte1[i] + punkte2[i];
			ergebnisMultiplikation[i] = punkte1[i] * punkte2[i];
			System.out.println(i+1+". Ergebnisse ->  Addition: "+ergebnisAddition[i]+"   Multiplikation: "+ergebnisMultiplikation[i]);
		}
	}

}
