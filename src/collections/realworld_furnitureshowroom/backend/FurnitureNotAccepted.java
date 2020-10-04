package collections.realworld_furnitureshowroom.backend;

@SuppressWarnings("serial")
public class FurnitureNotAccepted extends Exception {

	/*
	 * My own Exception to handle if entered furniture is invalid
	 */

	public FurnitureNotAccepted(String message) {

		super(message);

	}

}
