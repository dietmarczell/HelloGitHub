package lv11_tiere;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

	protected ArrayList<Figure> FigureList;

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
				if ( Size.containsKey("Klein"))
					Size.put("Klein", Size.get("Klein")+1);
				else
					Size.put("Klein", 1.0);
			}
			else if (figure.getArea() > 1000.0 && figure.getArea() <= 1499.0)
			{
				if ( Size.containsKey("Mittel"))
					Size.put("Mittel", Size.get("Mittel")+1);
				else
					Size.put("Mittel", 1.0);
			}
			else if (figure.getArea() > 1499.0)
			{
				if ( Size.containsKey("Groﬂ"))
					Size.put("Groﬂ", Size.get("Groﬂ")+1);
				else
					Size.put("Groﬂ", 1.0);
			}
		}
		return Size;
	}
}
