
public class mehrdimensionaleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] a = new int [2] [3];
		a [0] [0] = 1;
		System.out.println("Zahl "+a[0][0]);
		
		int [][] b = {{1,2,3,4,5},{6,7,8,9,10}};
		
		System.out.println("Zahlen "+b[0][2]+b[1][1]);
		
		
		for (int i = 0; i<b.length;i++) {
			for (int j = 0; j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
