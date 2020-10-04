package collections_practise_programs;

import java.util.*;
import java.util.stream.Collectors;

public class TreeS {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(30);
		ts.add(20);
		System.out.println(ts);
		System.err.println(ts.descendingSet());
		System.out.println(ts.pollFirst());
		System.out.println(ts);

		System.out.println(ts.first());
		System.out.println(ts);
		System.out.println(ts.last());
		System.out.println(ts);

		System.out.println(ts.pollLast());

		System.out.println(ts);

		int i = 20;

		System.out.println(ts.higher(i));

		List<Integer> li = ts.stream().map(x -> x * 2).collect(Collectors.toList());
		List<Integer> il = ts.stream().filter(x -> x % 3 == 0).collect(Collectors.toList());
		List<Integer> in = ts.stream().unordered().collect(Collectors.toList());

		System.out.println(in);
		System.out.println(li);
		System.out.println(il);

	}

}
