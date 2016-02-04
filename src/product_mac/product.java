package product_mac;

import java.util.ArrayList;

public class product {

	protected String Name;
	protected ArrayList<product> Parts;
	protected double price;

	public product(String name, double price) {
		Name = name;
		Parts = new ArrayList<>();
		this.price = price;
	}

	public double getPrice() {
		
		double gesamtpreis = price;
		
		for (product product : Parts) {
			gesamtpreis = gesamtpreis + product.getPrice();
		}
		return gesamtpreis;
	}
	
	public void add(product e)
	{
		Parts.add(e);
	}
	
	public String print()
	{
		return print("-");
	}
	public String print(String inherit)
	{
		String erg = inherit + this.Name + " Preis:" + getPrice() +"\n";
		
		for (product product : Parts) {
			erg = erg + product.print(inherit+"-");
		}
		return erg;
	}
}
