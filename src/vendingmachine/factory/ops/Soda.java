package vendingmachine.factory.ops;

public class Soda extends Machine implements Operatable {
	private static final double productMrp = 15.00;
	private double total, balance, totalReceived, coinReceived;
	String product;

	Soda() {
		product = "Soda";
		balance = 0.0;
		getStatus(product);
	}

	@Override
	public void start() {
		System.out.println(
				"\n\n" + "The Item you have choosen is Coke !" + "\n" + "1. Confirm" + "\n" + "2. Change Item");
	}

	public double getMrp() {
		return productMrp;
	}

	@Override
	public void collectCoins(double c) {
		double[] coinsAccepted = { 1, 5, 10, 25 };
		int n = coinsAccepted.length;
		coinReceived = c;
		// loop to Checking whether the inserted coin is acceptable
		for (int i = 0; i < n; i++) {
			if (coinReceived == coinsAccepted[i]) {
				totalReceived += c;
				System.out.println("Coin Added " + totalReceived + "$");
				return;
			}
		}
		System.out.println("\n" + "Insert Again" + "\n" + "Coins Accepted :" + "\n");
		for (int l = 0; l < n; l++) {
			System.out.print(coinsAccepted[l] + "$ \t");
		}
		return;
	}

	public double checkReceived() {
		if (totalReceived > total) {
			balance = totalReceived - total;
			coinReceived = 0;
		}
		return coinReceived;
	}

	// Method to determine the total amount to be paid
	public void setTotal(double t) {
		this.total = t;
	}

	@Override
	public void disburseItem() {
		System.out.println("\n" + product + " is Dispensed");
		System.out.println("\n" + "Don't forget to collect your Balance amount " + balance + "$ and bill recepit !");
	}

	@Override
	public void printBill() {
		System.out.println("Bill " + "\n" + "---------------------------" + "\n" + product + " * "
				+ (int) total / productMrp + " = " + total + "$ \n" + "Total amount paid :" + totalReceived + "$ \n"
				+ "Balance :" + balance + "$");
	}

	@Override
	public void stop() {
		System.out.println("\n\n" + "Machine Stopped ! Thank you Visit again !");
	}
}
