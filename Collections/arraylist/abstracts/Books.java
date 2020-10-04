package arraylist.abstracts;

import java.util.ArrayList;

import arraylist.exceptions.NotFoundException;

public abstract class Books {

	private ArrayList<String> bookNames = new ArrayList<>();
	private ArrayList<Double> bookPrice = new ArrayList<>();

	public void addBook(String book) {

		try {
			if (book == null) {

				throw new NotFoundException("Entered a null value");

			} else {

				bookNames.add(book);

			}
		} catch (NotFoundException e) {

			System.out.println(e.getMessage());

		}
	}

	public void addBook(Double price) {

		try {
			if (price == null) {

				throw new NotFoundException("Entered a null value");

			} else {

				bookPrice.add(price);

			}
		} catch (NotFoundException e) {

			System.out.println(e.getMessage());

		}

	}

	public void removeBook(String book) {

		bookNames.remove(book);
		bookPrice.remove(bookNames.indexOf(book));

	}

	public ArrayList<String> getBook() {

		return bookNames;

	}

	public ArrayList<Double> getPrice() {

		return bookPrice;

	}

	public abstract void bookDesc(String book);

}
