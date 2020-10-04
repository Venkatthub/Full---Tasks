package collections_practise_programs;

import java.util.*;

public class Hset {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();

		hs.add(10);
		hs.add(5);
		hs.add(30);
		hs.add(null);
		hs.add(20);
		System.out.println(hs);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		lhs.add(10);
		lhs.add(20);
		lhs.add(5);
		lhs.add(5);
		lhs.add(50);
		System.out.println(lhs);

	}
}
