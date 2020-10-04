package oops.abstraction.interfaces;

public class Account implements Banking, Bank {
	private double bal = 600.0;

	@Override
	public void bankService(int i) {
		switch (i) {
		case 1:
			viewBal();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		}
	}

	void deposit() {
		System.out.println("\n" + "Enter Amount to be deposited :");
	}

	void withdraw() {
		System.out.println("\n" + "Enter Amount to be withdrawn :");
	}

	@Override
	public void viewBal() {
		System.out.println("\n" + "Account Balance :" + bal);
	}

	@Override
	public void setDeposit(double l) {
		bal += l;
		System.out.println("\n" + "Amount Deposited :" + l);
		viewBal();
	}

	@Override
	public void setWithdraw(double l) {
		bal -= l;
		System.out.println("\n" + "Amount withdrawn :" + l);
		viewBal();
	}

}
