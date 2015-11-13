
public class ArrayUebung2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elemente = {3,4,5,6,7,8,9,10,15,20}; // int-arry mit 10 Werten 
		int elementeSumme = 0;
		
		for(int i=0 ; i < elemente.length ; i++) {
			elementeSumme = elementeSumme + elemente[i]; // int Array mit der Summe
			if (containsNumber(elemente,elemente[i])) {
				System.out.println("Zahl enthalten: "+elemente[i]);
			}
		}	
		System.out.println("Summe: "+elementeSumme);
		
	}
	
	public static boolean containsNumber( int[] numbers, int n) {
		for ( int i=0 ; i < numbers.length ; i++) {
			if (numbers[i] == n) {
				return true;
			}
		}
		return false;
	}

}
