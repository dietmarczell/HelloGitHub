package logisticmanager;

public class Shirt 
	implements Moveable {

	protected String Brand;
	protected String Size;
	protected String Color;
	
	
	public Shirt(String brand, String size, String color) {
		super();
		Brand = brand;
		Size = size;
		Color = color;
	}


	@Override
	public void move(String destination) {
		// TODO Auto-generated method stub
		System.out.println(this.Color+" "+this.Size+" "+this.Brand+" will be moved to "+destination);
	}

}
