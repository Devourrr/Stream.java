package week6day1;

class Animal{
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}
class Tiger extends Animal implements Predator{
	public String getFood() {
		return "apple";	
	}
	
	
}

class Lion extends Animal implements Predator{
	public String getFood() {
		return"banana";
	}
}
class Crocodile extends Animal implements Predator{

	public String getFood() {
		return"Strawberry";
	}
	
}


public class Zookeeper {
	
	public void feed (Tiger tiger) {
		System.out.println("feed apple");
		
	}
	public void feed (Lion lion) {
		System.out.println("feed banana");
	}
	public void feed(Predator predator) {
		
		System.out.println("feed" + predator.getFood());
	}
	
	public static void main(String[] args, Tiger predator) {
		Zookeeper zookeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
		zookeeper.feed(predator);
		

	}

}
