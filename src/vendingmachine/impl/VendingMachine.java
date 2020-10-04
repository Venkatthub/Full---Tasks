package vendingmachine.impl;

import java.util.List;
import vendingmachine.abstracts.Beverage;
import vendingmachine.abstracts.BillPrintable;

public class VendingMachine implements BillPrintable {

	private final List<Beverage> beverages;

	public VendingMachine(List<Beverage> beverages) {
		this.beverages = beverages;
		printAvailableBeverages();
	}

	public void printAvailableBeverages() {
		beverages.forEach(Beverage::printAd);
	}

	@Override
	public void printBill(Beverage beverage) {
		System.out.println("Thank you for your purchase...");
		System.out.println("Beverage: " + beverage.getName());
		System.out.println("Price: $" + beverage.getPrice());
	}
}
