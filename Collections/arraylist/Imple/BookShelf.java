package arraylist.Imple;

import arraylist.abstracts.*;
import arraylist.exceptions.*;

public class BookShelf extends Books implements Deliverable {

	private String name;
	private double price;

	public void booksInShelf() {

		int n = getBook().size();

		System.out.println("Number of books in shelf :" + n + "\n\n");

		for (String book : getBook()) {
			System.out.println("\n" + "Name : " + book);
		}
	}

	public void addBooks(String bookName) {

		addBook(bookName);

	}

	public void addPrice(Double bookPrice) {

		addBook(bookPrice);

	}

	@Override
	public void bookDesc(String book) {

		if (getBook().contains(book)) {

			this.name = book;
			int index = getBook().indexOf(book);
			this.price = getPrice().get(index);

			System.out.println("Book is in self !\n\n");
			System.out.println("Book :" + book + "\n" + "Price :" + price);

		} else {
			throw new BookNotFound("Book not Found !");
		}

	}

	@Override
	public void read() {

		int n = getBook().indexOf(name);
		if (n != 4 && n != 6 && n != 3) {
			System.out.println(name + " book is available to read.");
		} else {

			System.out.println(
					"\n" + " Please buy the book to read !" + "\n" + "Please pay " + price + "to own the book.");
		}
	}

	@Override
	public void takeAway(String name, String location, Buyer b) {

		b.setBuyer(name, location, this.name);

	}

	public void removeBook() {

		int index = getBook().indexOf(name);
		getBook().remove(index);
		getPrice().remove(index);

	}

}
