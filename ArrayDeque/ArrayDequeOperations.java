package com.rakesh.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class ArrayDequeOperations {

	public static void main(String[] args) {
		// 1. ArrayDeque as a Stack
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(10);
		stack.push(12);
		stack.push(43);
		stack.push(25);
		
		for(int x:stack)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		stack.pop();
		stack.pop();
		
		System.out.println(stack.peek());
		stack.forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		// 2. ArrayDeque as a Queue
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.offer(20);
		queue.offer(64);
		queue.offer(21);
		queue.offer(34);
		
		for(int x: queue)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		queue.poll();
		
		System.out.println(queue.peek());
		
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		// 3.ArrayDeque as a Deque
		
		Deque<Integer> d = new ArrayDeque<>();
	    d.offerFirst(24);
	    d.offerFirst(45);
	    d.offerLast(15);
	    d.offerLast(38);
	    
	    for(int x:d)
	    {
	    	System.out.print(x+" ");
	    }
	    
	    System.out.println();
	    
	    d.pollFirst();
	    d.pollLast();
	    
	    System.out.println(d.peekFirst());
	    System.out.println(d.peekLast());
	    
	    d.forEach(x->System.out.print(x+" "));
	    
	}

}
