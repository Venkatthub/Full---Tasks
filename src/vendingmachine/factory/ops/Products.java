package vendingmachine.factory.ops;

public class Products {
	private static int product;
	private int quantity;
	private double mrp, moneyNeeded;
	Coke c = null;
	Pepsi p = null;
	Soda s = null;

	// Constructor to determine the type of product
	public Products(int i) {
		product = i;
	}

	// Method to set the quatity needed
	public void setQantity(int i) {
		this.quantity = i;
		setTotal();
	}

	// Method to calculate the total amount with respect to quantity
	public void setTotal() {
		double totalCost = mrp * quantity;
		System.out.println("\n" + "Total amount to be paid :" + totalCost + "$ \n");
		if (product == 1) {
			c.setTotal(totalCost);
		} else if (product == 2) {
			p.setTotal(totalCost);
		} else if (product == 3) {
			s.setTotal(totalCost);
		}
	}

	// Method to get the amount inserted by the user
	public double setDollar(double d) {
		if (product == 1) {
			c.collectCoins(d);
			moneyNeeded = c.checkReceived();
		} else if (product == 2) {
			p.collectCoins(d);
			moneyNeeded = p.checkReceived();
		} else if (product == 3) {
			s.collectCoins(d);
			moneyNeeded = s.checkReceived();
		}
		return moneyNeeded;
	}

	// Method to choose the product
	public void getProduct() {
		if (product == 1) {
			c = new Coke();
			mrp = c.getMrp();
			System.out.println("Price :" + mrp);
			c.start();
		} else if (product == 2) {
			p = new Pepsi();
			mrp = p.getMrp();
			System.out.println("Price :" + mrp);
			p.start();
		} else if (product == 3) {
			s = new Soda();
			mrp = s.getMrp();
			System.out.println("Price :" + mrp);
			s.start();
		}
	}

	// Method to dipense and print bills
	public void setProduct() {
		if (product == 1) {
			c.disburseItem();
			c.printBill();
			c.stop();
		} else if (product == 2) {
			p.disburseItem();
			p.printBill();
			p.stop();

		} else if (product == 3) {
			s.disburseItem();
			s.printBill();
			s.stop();
		}
	}

}
