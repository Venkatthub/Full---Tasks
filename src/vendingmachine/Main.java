package vendingmachine;

import java.util.Arrays;
import vendingmachine.abstracts.Beverage;
import vendingmachine.impl.Coke;
import vendingmachine.impl.Pepsi;
import vendingmachine.impl.VendingMachine;

public class Main {

	public static void main(String[] args) {
		final Beverage pepsi = new Pepsi(10);
		final Beverage coke = new Coke(15);
		final Beverage largePepsi = new Pepsi(25);

		final VendingMachine machine = new VendingMachine(Arrays.asList(pepsi, coke, largePepsi));
		machine.printBill(pepsi);
		machine.printBill(coke);
		machine.printBill(largePepsi);
	}
}
