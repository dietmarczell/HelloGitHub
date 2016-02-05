package org.campus02.event;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {

	private ArrayList<Event> events;
	
	public EventKalender() {
		this.events = new ArrayList<>();
	}

	public void add (Event event){
		events.add(event);
	}
	
	public Event getByTitle(String title)
	{
		for (Event event : events) {
			if (event.getTitle() == title)
				return event;
		}
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort)	
	{
		ArrayList<Event> erg = new ArrayList<>();
		for (Event event : events) {
			if (event.getOrt() == ort)
				erg.add(event);
		}
		return erg;
	}
	
	public ArrayList<Event> getByEintrittsPreis(double min, double max)
	{
		ArrayList<Event> erg = new ArrayList<>();
		for (Event event : events) {
			if (event.getEintrittspreis() >= min && event.getEintrittspreis() <= max)
			{
				erg.add(event);
			}
		}
		return erg;
	}
	
	public ArrayList<Event> getMostExpensiveByOrt(String ort)
	{
		ArrayList<Event> erg = new ArrayList<>();
		for (Event event : events) {
			for (Event event_erg : events) {
				if (event_erg.getEintrittspreis() < event.getEintrittspreis() && event.getOrt() == ort)
				{
					erg.clear();
					erg.add(event);
				}
			}
		}
		return erg;
	}
	
	public double getAvgPreisByOrt(String ort)
	{
		double avg_preis = 0;
		int counter = 0;
		for (Event event : events) {
			if (event.getOrt() == ort)
			{
				avg_preis += event.getEintrittspreis();
				counter++;
			}
		}
		return avg_preis/counter;
	}
	
	public HashMap<String,Integer> getCountByOrt()
	{
		HashMap<String,Integer> eventmap = new HashMap<>();
		for (Event event : this.events) {
			if (eventmap.containsKey(event.getOrt()))
			{
				eventmap.put(event.getOrt(), eventmap.get(event.getOrt())+1);
			}
			else
			{
				eventmap.put(event.getOrt(),1);
			}
		}
		return eventmap;
	}
	
}
