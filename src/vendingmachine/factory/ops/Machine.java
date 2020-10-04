package vendingmachine.factory.ops;

public abstract class Machine {

	public void getStatus(String s) {

		System.out.println(s + "Machine is Started ! Ready to use :");

	}

	abstract void start();

	abstract void stop();
}