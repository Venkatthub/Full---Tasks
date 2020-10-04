package oops.inheritance.single;

/*
 *  Single inheritance
 * Car is a base class and Audi is a child class
 */

public class Driver {

	public static void main(String[] args) {

		Ferrari car = new Ferrari();

		car.setCar("black", 800.35);

		car.carInfo();

	}

}

// Base class
class Car {

	String color;
	double maxSpeed;

	void setCar(String color, double maxSpeed) {

		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}

// Child class which derives from parent
class Ferrari extends Car {

	String name;

	public Ferrari() {

		this.name = "ferrari";

	}

	void carInfo() {

		System.out.println(
				"Your " + this.color + " color " + this.name + " can move at a maximum speed of " + this.maxSpeed + "Km/hr.");

	}

}