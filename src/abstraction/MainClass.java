package abstraction;

public class MainClass {

	public static void main(String[] args) {

		Bank b = new HDFCBank();

		b.deposit();
		b.withdraw();
		b.calculateInterest();

	}

}
