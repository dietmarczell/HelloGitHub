package lv11_tiere;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(85, 10);
		Rectangle rect2 = new Rectangle(120, 10);
		Rectangle rect3 = new Rectangle(40, 10);
		Circle krei1 = new Circle(50);
		Circle krei2 = new Circle(100);
		
		System.out.println("rect1 umfang:"+rect1.getPerimeter()+" fläche:"+rect1.getArea());
		System.out.println("rect2 umfang:"+rect2.getPerimeter()+" fläche:"+rect2.getArea());
		System.out.println("rect3 umfang:"+rect3.getPerimeter()+" fläche:"+rect3.getArea());
		System.out.println("krei1 umfang:"+krei1.getPerimeter()+" fläche:"+krei1.getArea());
		System.out.println("krei2 umfang:"+krei2.getPerimeter()+" fläche:"+krei2.getArea());
		
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
