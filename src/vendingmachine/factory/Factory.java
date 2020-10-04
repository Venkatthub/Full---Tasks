package vendingmachine.factory;

import vendingmachine.factory.ops.Products;

import java.util.Scanner;

public class Factory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Products product = null;
		System.out.println("Welcome to Limitless Vending Factory !" + "\n\n" + "Available Items" + "\n\n" + "1. Coke \n"
				+ "2. Pepsi \n" + "3. Soda" + "\n\n");
		int choice;
		do {
			System.out.println("Enter your choice : \n");
			choice = scan.nextInt();
			product = new Products(choice);
			product.getProduct();
			if (scan.nextInt() == 2) {
				choice = 0;
			}
		} while (choice == 0);
		System.out.println("\n\n" + "Quantity :");
		product.setQantity(scan.nextInt());
		double d, n = 0;
		do {
			System.out.println("\n" + "Please insert coins :");
			d = scan.nextDouble();
			n = product.setDollar(d);
		} while (n != 0);
		product.setProduct();
		scan.close();
	}
}
