package com.rakesh.Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();
		// Inserting elements from both ends
		d.offerFirst(10);
		d.offerFirst(23);
		d.offerFirst(20);
		d.offerLast(65);
		d.offerLast(32);
		
		// Traversing through deque
		for(int x:d)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		// Removing items from both ends
		d.pollFirst();
		d.pollLast();
		
		//Traversing through deque
		d.forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		//Getting first and last element
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		
		//Traversing in reverse order
		Iterator<Integer> it = d.descendingIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
