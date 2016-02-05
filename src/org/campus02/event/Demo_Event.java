package org.campus02.event;

public class Demo_Event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event event1 = new Event("Essen","Graz",15.0);
		Event event2 = new Event("Meeting","Wien",10.0);
		Event event3 = new Event("Meeting","Graz",10.0);
		Event event4 = new Event("Essen","Wien",20.0);
		Event event5 = new Event("Konzert","Linz",35.0);
		
		EventKalender test = new EventKalender();
		test.add(event1);
		test.add(event2);
		test.add(event3);
		test.add(event4);
		test.add(event5);
		
		System.out.println(test.getByEintrittsPreis(10, 15));
		System.out.println(test.getByOrt("Wien"));
		System.out.println(test.getByTitle("Meeting"));
		System.out.println(test.getMostExpensiveByOrt("Wien"));
		System.out.println(test.getAvgPreisByOrt("Wien"));
		System.out.println(test.getCountByOrt());
	}

}
