package accessmodifiers.check;

public class Night {

	public static double nightStartTime = 6.00; // can be accessed anywhere by using import statement

	protected static final int days = 7;

	// Can be used by subclasses in other packages by using import statement
	protected void display() {

		System.out.println("Night time starts from :" + nightStartTime);
	}

	void displayNight() {

		System.out.println("Night Time !");
	}

}
