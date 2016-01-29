package logisticmanager;

import java.util.ArrayList;
import java.util.HashMap;

import konto.Konto;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car jaguar = new Car("Jaguar", "Black", 1200.0);
		Shirt tshirt = new Shirt("Hilfiger", "L", "blue");
		
		LogisticManager Manager = new LogisticManager(new ArrayList<Moveable>());
		Manager.addMov(tshirt);
		Manager.addMov(jaguar);
		
		Manager.moveAll("Graz");
		
		Car polo = new Car("Polo", "Yellow", 1200.0);
		Car polo2 = new Car("Polo", "Yellow", 1200.0);
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(jaguar);
		cars.add(polo);
		cars.add(polo2);
		
		HashMap<String, Integer> map_car_color_list = new HashMap<>();
		for (Car car : cars) {
			if(map_car_color_list.containsKey(car.Color))
			{
				map_car_color_list.put(car.Color, map_car_color_list.get(car.Color)+1);
			}
			else
			{
				map_car_color_list.put(car.Color, 1);
			}
		}
		System.out.println(map_car_color_list.toString());
	}

}
