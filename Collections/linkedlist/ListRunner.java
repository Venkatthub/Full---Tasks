package linkedlist;

import linkedlist.imple.LinkList;

public class ListRunner {

	// Singly Linked List implementation - Runner Class to test the list

	public static void main(String[] args) {

		LinkList<String> list = new LinkList<>();

		// Inserting data to list
		list.insert("Venkat");
		list.insert("Naveen");
		list.insert("Ram");
		list.insert("Alex");

		// Displaying the list of elements in list
		list.show();
		System.out.println(list.showLast());

		// Fetching first element
		System.out.println("First element :" + list.showFirst());

		// To print the size of the list
		System.out.println("Size of the list :" + list.size());
		list.show();

		System.out.println("First element :" + list.showFirst());

		list.set(2, "Raghu");
		list.show();
		list.set(4, "Rahul");
		list.show();
		// Removing First element
		list.removeFirst();
		list.show();
		list.removeLast();
		list.show();
		list.removeElement("Ram");
		list.show();
		list.removeElement("Raghu");
		list.show();
		// Removing Last element
		list.removeLast();
		list.show();

	}

}
