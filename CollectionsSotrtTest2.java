package week6day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car implements Comparable<Car>{
	String number;
	String kinds;
	
	public Car(String number, String kinds) {
		this.number = number;
		this.kinds = kinds;
	}
	@Override
	public String toString() {
		return kinds + " :" + number;
	}
	public static void add(Car a) {
		
		
	}
	@Override
	public int compareTo(Car o) {
		
		return this.kinds.compareTo(o.kinds);
	}
}


public class CollectionsSotrtTest2 {

	public static void main(String[] args) {
		ArrayList<Car> Car = new ArrayList<>();
		Car a = new Car ("8247", "Cruise");
		Car b = new Car ("2541", "Grandeur");
		Car c = new Car ("0926", "Palisade");
		
		Car.add(a);
		Car.add(b);
		Car.add(c);
		
		Collections.sort(Car);
		for(Car i : Car)
			System.out.println(i);
		
		class KindsSort implements Comparator<Car>{

			@Override
			public int compare(Car o1, Car o2) {
				
				return o1.kinds.compareTo(o2.kinds);
			}
		
		}
		
		
		Collections.sort(Car,new KindsSort());

		Collections.sort(Car,(o1,o2)-> o1.kinds.compareTo(o2.kinds));
		for(Car cs : Car)
			System.out.println(cs);
	}
	

}
