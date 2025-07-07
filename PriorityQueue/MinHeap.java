package com.rakesh.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeap {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(50);
		pq.add(12);
		pq.add(42);
		pq.add(35);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		pq.forEach(x->System.out.print(x+" "));
	}

}
