package com.rakesh.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.offer(10);
		q.offer(20);
		q.offer(50);
		q.offer(35);
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
		
		q.forEach(x->System.out.print(x+" "));
		
		while(!q.isEmpty())
		{
			System.out.print(q.poll()+" ");
		}
		System.out.println();
		System.out.println(q.isEmpty());
	}

}
