package vendingmachine.impl;

import vendingmachine.abstracts.Beverage;

public class Coke extends Beverage {

	public Coke(double price) {
		super("Coke", price);
	}

	@Override
	public void printAd() {
		final String name = this.getName();
		final double price = this.getPrice();

		System.out.println(name + " - $" + price);
	}
}
