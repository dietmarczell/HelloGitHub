package animal;

public abstract class Animal
{
	private String name;
	private String color;
	private int countEyes;
	
	public Animal(String name, String color, int countEyes)
	{
		this.name = name;
		this.color = color;
		this.countEyes = countEyes;
	}
	
	public abstract void walk();
	/*{
		System.out.println("walk");
	}*/
	
	public abstract void makeNoise();
	/*{
		System.out.println("noise");
	}*/
}

