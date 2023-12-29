package vaibhao.vk;

abstract class Vehicle1 {
	abstract void engine();
}

class Bike1 extends Vehicle1 {
	void engine() {
		System.out.println("200 CC");
	}
}

class Car1 extends Vehicle {
	void engine() {
		System.out.println("1000 CC");
	}
}

public class VehicleAbstractAppp {
	public static void main(String[] args) {
		Bike1 b = new Bike1();
		b.engine();
		Car1 c = new Car1();
		c.engine();
	
		
	}
}