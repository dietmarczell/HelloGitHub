
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		matrix(20);
		
	}
	
	public static void matrix (int mlength) {
		for (int i = 0; i<mlength;i++) {
			for (int j = 0; j<mlength;j++) {
				if (i == j) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
	}

}
