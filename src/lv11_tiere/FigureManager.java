package lv11_tiere;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

	protected ArrayList<Figure> FigureList;

	public static final String klein = "Klein";
	public static final String mittel = "Mittel";
	public static final String gross = "Groﬂ";
	
	public FigureManager(ArrayList<Figure> figureList) {
		FigureList = figureList;
	}
	
	public void add (Figure f)
	{
		FigureList.add(f);
	}
	
	public double getMaxPerimeter()
	{
		double max_peri = 0.0;
		for (Figure figure : FigureList) {
			if (figure.getPerimeter() > max_peri)
				max_peri = figure.getPerimeter();
		}
		return max_peri;
	}
	
	public double getAverageAreaSize()
	{
		double average_area = 0.0;
		int counter = 0;
		for (Figure figure : FigureList) {
			average_area =+ figure.getArea();
			counter++;
		}
		return average_area/counter;
	}

	public HashMap<String, Double> getAreaBySizeCategories()
	{
		HashMap<String, Double> Size = new HashMap<>();
		for (Figure figure : FigureList) {
			if (figure.getArea() <= 1000.0)
			{
				if ( Size.containsKey(klein))
					Size.put(klein, Size.get(klein)+figure.getArea());
				else
					Size.put(klein, figure.getArea());
			}
			else if (figure.getArea() > 1000.0 && figure.getArea() <= 1499.0)
			{
				if ( Size.containsKey(mittel))
					Size.put(mittel, Size.get(mittel)+figure.getArea());
				else
					Size.put(mittel, figure.getArea());
			}
			else if (figure.getArea() > 1499.0)
			{
				if ( Size.containsKey(gross))
					Size.put(gross, Size.get(gross)+figure.getArea());
				else
					Size.put(gross, figure.getArea());
			}
		}
		return Size;
	}
}
