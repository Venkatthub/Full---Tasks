package arraylist.Imple;

import java.util.*;

public class Buyer {

	private ArrayList<String> buyerNames = new ArrayList<>();
	private ArrayList<String> buyerLocations = new ArrayList<>();
	private ArrayList<String> books = new ArrayList<>();

	public void setBuyer(String name, String location, String book) {

		buyerNames.add(name);
		buyerLocations.add(location);
		books.add(book);

	}

	public List<String> getBookBuyer() {
		return books;
	}

	public List<String> getBuyer() {
		return buyerNames;
	}

	public List<String> getLocation() {
		return buyerLocations;
	}

}
