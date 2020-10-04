package oops.abstraction.abstractclasses;

public abstract class Animal {

	abstract void sound();

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		System.out.println("Dog sound");
		d.sound();
		System.out.println("Cat sound");
		c.sound();
	}
}

class Dog extends Animal {

	void sound() {
		System.out.println("Woff !! Woff !!");
	}
}

class Cat extends Animal {

	void sound() {
		System.out.println("Meow !! Meow !!");
	}
}