package collections.collections_practise_programs;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	// ArrayList

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		li.add(10);
		li.add(20);
		li.add(2, 30);
		li.add(50);

		System.out.println(li);

		li.add(2, 40);

		System.out.println(li);

	}

}
