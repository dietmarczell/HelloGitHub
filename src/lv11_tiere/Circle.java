package lv11_tiere;

public class Circle extends Figure {

	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return (2*radius*3.14159);
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return (radius*radius*3.14159);
	}

}
