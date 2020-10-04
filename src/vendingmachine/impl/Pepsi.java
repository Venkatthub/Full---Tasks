package vendingmachine.impl;

import vendingmachine.abstracts.Beverage;

public class Pepsi extends Beverage {

	public Pepsi(double price) {
		super("Pepsi", price);
	}

	@Override
	public void printAd() {
		final String name = this.getName();
		final double price = this.getPrice();

		System.out.println(name + " - $" + price);
	}
}
