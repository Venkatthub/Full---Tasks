package arraylist.Imple;

import java.util.List;
import arraylist.exceptions.*;

public class Librarian {

	public void addBooks(List<String> book, List<Double> bookPrice, BookShelf bf) {

		for (String name : book) {

			assert name != null : "Entered a Null value";
			bf.addBook(name);
		}

		for (double price : bookPrice) {
			assert price != 0 : "Entered price is not acceptable";
			bf.addBook(price);
		}
	}

	public void getBuyerDetails(String s, Buyer b) {

		int index = 0;

		if (b.getBookBuyer().contains(s)) {
			index = b.getBookBuyer().indexOf(s);
		} else if (b.getBuyer().contains(s)) {
			index = b.getBuyer().indexOf(s);
		} else {
			throw new NotFoundException("Book or Buyer not found");
		}

		System.out.println("\n\n" + "Buyer Name :" + b.getBuyer().get(index));
		System.out.println("\n" + "Buyer Location :" + b.getLocation().get(index));
		System.out.println("\n" + "Book Bought :" + b.getBookBuyer().get(index));

	}

}
