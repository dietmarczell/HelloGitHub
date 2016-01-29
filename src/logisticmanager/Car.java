package logisticmanager;

public class Car 
	implements Moveable{

	protected String Type;
	protected String Color;
	protected double Weight;
	
	
	public Car(String type, String color, double weight) {
		super();
		Type = type;
		Color = color;
		Weight = weight;
	}


	@Override
	public void move(String destination) {
		// TODO Auto-generated method stub
		System.out.println(this.Color+" "+this.Type+" will be moved to "+destination);
	}
	
}
