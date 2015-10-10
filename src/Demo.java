import java.io.InputStream;

public class Demo {

	private static String zeichenkette = "Czell Dietmar";

	public static void main(String[] args) {

		boolean treeFront = true;
		char meinZeichen = 'X';
		int numberLeafes = 0;
		System.out.println("treeFront Boolean is \n <" + treeFront + "> \n");
		System.out.println("My Leaf-Number is \n <" + numberLeafes + ">\n");
		System.out.println(meinZeichen + "\n");
		System.out.println(zeichenkette);

		int a = 6;
		int b = 6;
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "%" + b + "=" + (a % b));

	}

}
