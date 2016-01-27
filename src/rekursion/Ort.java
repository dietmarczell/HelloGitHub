package rekursion;

import java.util.ArrayList;

public class Ort {

	private String name;
	private ArrayList<Ort> verbundeneOrte;
	
	public Ort(String name)
	{
		this.name = name;
		verbundeneOrte = new ArrayList<>();
	}
	
	public ArrayList<Ort> getNachbarn()
	{
		return verbundeneOrte;
	}
	
	public void addNachbar(Ort ort)
	{
		verbundeneOrte.add(ort);
	}
	
	public String getName()
	{
		return this.name;
	}
}
