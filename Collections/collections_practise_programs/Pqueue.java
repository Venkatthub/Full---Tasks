package collections_practise_programs;

import java.util.PriorityQueue;

public class Pqueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("eat");
		pq.add("edwa");
		pq.add("azen");
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
	
}
