package collections_practise_programs;
import java.util.*;

public class Adq {

	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
		
		adq.offer(20);
		adq.offerFirst(10);
		adq.add(60);
		adq.offerLast(50);
		adq.add(30);
		adq.add(40);
		
		System.out.println(adq);
		
		ArrayDeque<Integer> aq=new ArrayDeque<Integer>();
		
		aq.add(20);
		aq.add(10);
		aq.add(60);
		aq.add(50);
		aq.add(30);
		aq.add(20);
		
		System.out.println(aq);
	}
	
}
// supports insertion order, duplicate values
// does not support null values
