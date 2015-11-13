
public class forschleife {

	public static void main(String[] args) {

		// 0-10
		for (int i=0; i<=10; i++) {
			System.out.println("Durchlauf "+i);
		}
		
		// umgekehrt
		for (int i=10; i>=0; i--) {
			System.out.println("Durchlauf "+i);
		}
		
		// jede 5te Zahl von 20-90 (incl.)
		for (int i=20; i<=90; i+=5) {
			System.out.println(i);
		}
		
		// 1..100 nur die durch 3 teilbar sind
		// abbruch wenn 10te zahl gefunden
		int j = 0;
		for (int i=1; i<=100; i++) {
			if (i%3 == 0){
				j++;
				System.out.println(i);
				if (j == 10) {
					System.out.println("Abbruch: 10te Zahl gefunden!");
					break;
				}
			}
		}
		
		// 1..100 ausgeben - ausschließen die durch 5 teilbar sind
		// sowie zahlen 40..70 ausnehmen von der ausgabe
		for (int i=1; i<=100; i++) {
				if ( (i >=40 && i <= 70) || (i%5 == 0) ) {
					continue;
				}
				System.out.println(i);
			}
		
	}

}
