package collections.collections_practise_programs;

import java.util.*;

public class Linkedist {

	public static void main(String[] args) {

		LinkedList<Integer> lin = new LinkedList<>();

		lin.add(25);
		lin.add(35);
		lin.add(45);
		lin.add(75);
		lin.add(65);
		lin.add(45);

		System.out.println(lin);

		int i = lin.pop();
		System.out.println(i);
		System.out.println(lin);

		ListIterator<Integer> list = lin.listIterator();

		while (list.hasNext()) {

			int ils = list.next();

			System.out.println(ils);

		}
	}

}
//supports insertion order, duplicate values, null values and duplicate null values