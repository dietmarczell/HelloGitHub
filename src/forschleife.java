
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
			System.out.println("Durchlauf "+i);
		}
		
		// 1..100 nur die durch 3 teilbar sind
		for (int i=1; i<=100; i++) {
			if (i%3 == 0){
				System.out.println("Durchlauf "+i);
			}
		}
	}

}
