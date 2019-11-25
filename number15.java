package CollectionsTest;

import java.util.ArrayDeque;
import java.util.Deque;


public class number15 {

	public static void main(String[] args) {
	Deque<String> dq = new ArrayDeque<String>();
		
		dq.add("Joe");
		dq.add("Jon");
		dq.addLast("Jack");
		dq.addFirst("Josh");
		
		System.out.println("Elements in Deque: "+dq);
		dq.addFirst("Roger");
		dq.addLast("Robin");
		
		System.out.println("Elements in Deque:" +dq);
		
		System.out.println("Removed element: "+dq.removeFirst());
		System.out.println("Removed element: "+dq.removeLast());
		
	//adding and removing elements from 	element on both sides(first and last) 
	}

}
