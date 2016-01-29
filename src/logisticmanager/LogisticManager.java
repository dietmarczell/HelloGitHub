package logisticmanager;

import java.util.ArrayList;

public class LogisticManager {

	protected ArrayList<Moveable> MovList = new ArrayList<>();

	public LogisticManager(ArrayList<Moveable> movList) {
		super();
		MovList = movList;
	}
	
	public void moveAll(String destination)
	{
		for (Moveable moveable : MovList) {
			moveable.move(destination);
		}
	}
	
	public void addMov(Moveable moveable)
	{
		MovList.add(moveable);
	}

	
}
