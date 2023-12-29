package vaibhao.vk;

abstract class Vehicle {
	abstract void engine();
}

class Bike extends Vehicle {
	void engine() {
		System.out.println("200 CC");
	}
}

class Car extends Vehicle {
	void engine() {
		System.out.println("1000 CC");
	}
}

public class AbstractApplication {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.engine();
		Car c = new Car();
		c.engine();
	}
}
