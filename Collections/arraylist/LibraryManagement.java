package arraylist;

import java.util.*;
import java.util.Scanner;

import arraylist.Imple.*;

public class LibraryManagement {

	static Scanner scan = new Scanner(System.in);
	static BookShelf bs = new BookShelf();
	static Librarian li = new Librarian();
	static Buyer b = new Buyer();

	public static void main(String[] args) {

		int again = 0;

		ArrayList<String> bookName = new ArrayList<>();
		bookName.add("harrypotter");
		bookName.add("darkwoods");
		bookName.add("moonlight");
		bookName.add("little");
		bookName.add("firework");

		ArrayList<Double> bookPrice = new ArrayList<>();
		bookPrice.add(450.25);
		bookPrice.add(654.25);
		bookPrice.add(1200.00);
		bookPrice.add(250.85);
		bookPrice.add(150.55);

		li.addBooks(bookName, bookPrice, bs);

		do {

			System.out.println("Enter as :" + "\n" + "1. Librarian" + "\n" + "2. User");

			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter your choice :" + "\n" + "1. Add Books" + "\n" + "2. Fetch Details");

				int n = scan.nextInt();

				if (n == 1) {

					ArrayList<String> name = new ArrayList<>();
					ArrayList<Double> price = new ArrayList<>();

					int shelfCapacity = 5;

					while (shelfCapacity != 0) {

						System.out.println("Please add books and price !");
						System.out.println("\n" + "Enter Name of Book :");
						name.add(scan.next());
						System.out.println("\n" + "Enter Price of Book :");
						price.add(scan.nextDouble());
						shelfCapacity -= 1;
						System.out.println("Want to add another book ?" + "\n" + "1. yes" + "\n" + "2. no");

						int addBookChoice = scan.nextInt();
						if (addBookChoice != 1) {
							shelfCapacity = 0;
						}

					}

					li.addBooks(name, price, bs);

				} else {
					System.out.println("\n\n" + "Enter the book or buyer name to fetch details :");
					li.getBuyerDetails(scan.next(), b);
				}

				System.out.println("\n" + "Want to enter library again ?" + "\n" + "1. yes" + "\n" + "2. no");
				int enterChoice1 = scan.nextInt();
				if (enterChoice1 == 1) {
					again = 1;
				} else {
					again = 0;
				}
				break;

			case 2:

				bs.booksInShelf();
				System.out.println("\n\n" + "Enter the book you want to read :" + "\n");
				String book = scan.next();
				bs.bookDesc(book);
				System.out.println("\n" + "Want to read or buy ?" + "\n" + "1. Read" + "\n" + "2. Buy");

				int buyChoice = 0;
				choice = scan.nextInt();
				if (choice == 1) {
					bs.read();
					System.out.println("Want to buy the book ?" + "\n" + "1. Buy" + "\n" + "2. No Thanks");
					buyChoice = scan.nextInt();
				} else if (choice == 2) {
					System.out.println("\n\n" + "Enter your name and location :");
					bs.takeAway(scan.next(), scan.next(), b);
					bs.removeBook();
				} else {
					System.out.println("Invalid input");
				}

				if (buyChoice == 1) {
					System.out.println("\n\n" + "Enter your name and location :");
					bs.takeAway(scan.next(), scan.next(), b);
					System.out.println("\n\n" + "Happy Reading ! Visit again !");
				}
				System.out.println("\n" + "Want to enter library again ?" + "\n" + "1. yes" + "\n" + "2. no");
				int enterChoice2 = scan.nextInt();
				if (enterChoice2 == 1) {
					again = 1;
				} else {
					again = 0;
				}
				break;

			default:
				System.out.println("Invalid choice");

			}
		} while (again != 0);

		System.out.println("\n" + "Want to Display buyer details ?" + "\n" + "1. yes" + "\n" + "2. No");

		if (scan.nextInt() == 1) {
			System.out.println(b.getBuyer());
			System.out.println("Enter Book or Buyer Name :" + "\n");
			li.getBuyerDetails(scan.next(), b);
		}

	}

}
