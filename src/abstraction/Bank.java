package abstraction;

public abstract class Bank {

	public void deposit() {

		System.out.println("You can fill the chellan and deposit your money !");

	}

	public void withdraw() {

		System.out
				.println("You can fill up the cash withdraw chellan with the required amount and withdraw the money !");
	}

	public abstract void calculateInterest();

}
