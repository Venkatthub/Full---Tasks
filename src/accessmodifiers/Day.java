package accessmodifiers;

import accessmodifiers.check.Night;

/*
 * Public - can be accessed anywhere in the project
 * Proctected - can be accessed within the package and by sub classes of different package
 * Default - can be accessed only within the class and by package
 * Private - can be accessed only within the class
 */

public class Day extends Night {

	static String message = "A day is a combination of morning and night !"; // Default access modifier - within class
																				// and
	// within same package

	public static void main(String[] args) {

		System.out.println(message);

		System.out.println("There are " + days + "in a week !");// protected days variable in different package accessed
																// by its subclass

		// can't import protected methods and default methods of Night by using object
		// since it is present
		// in different package

	}

}
