package assigment;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListAndQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new LinkedList<>();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("million");
		li.add("four");
		li.add("five");
		System.out.println(li.toString());
		
		/*
		 * Prints out the list in order it was put in
		 * Elements stored in a inserted order
		 */
		
		Queue<String> pq = new PriorityQueue<>();
		pq.add("one");
		pq.add("two");
		pq.add("three");
		pq.add("million");
		pq.add("four");
		pq.add("five");
		System.out.println(pq.toString());
		
		/*
		 * Prints out without a specific order
		 * Elements stored in Priority Queue without a specific order
		 */
		// add method queue
		pq.add("Dog");
		System.out.println(pq.toString());
		
		// remove method queue
		
		pq.remove("Dog");
		System.out.println(pq.toString());
		
	

		
		


	}

}
