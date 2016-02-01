package lv11_tiere;

public class Rectangle extends Figure {

	protected double length;
	protected double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return (length+width)*2.0;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return length*width*1.0;
	}
	
	

}
