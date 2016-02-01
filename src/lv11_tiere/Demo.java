package lv11_tiere;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(85, 10);
		Rectangle rect2 = new Rectangle(120, 10);
		Rectangle rect3 = new Rectangle(40, 10);
		Circle krei1 = new Circle(200);
		Circle krei2 = new Circle(100);
		
		FigureManager figures = new FigureManager(new ArrayList<>());
		
		figures.add(rect1);
		figures.add(rect2);
		figures.add(rect3);
		figures.add(krei1);
		figures.add(krei2);
		
		System.out.println(figures.getAreaBySizeCategories());
		System.out.println(figures.getMaxPerimeter());
		System.out.println(figures.getAverageAreaSize());
	}

}
