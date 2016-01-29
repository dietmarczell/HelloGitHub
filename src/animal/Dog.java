package animal;

public class Dog extends Animal {

	public Dog(String name, String color, int countEyes) {
		super(name, color, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Gehen wie ein Hund");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("wuff wuff");
	}
	
	

}
