package animal;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog wuffi = new Dog("Wuffi", "schwarz", 2);
		Animal a = wuffi;
		wuffi.makeNoise();
		wuffi.walk();
		
		Bird twietie = new Bird("Twietie","Gelb",2);
		twietie.fly();
	}

}
