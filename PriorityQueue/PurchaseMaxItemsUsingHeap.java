package com.rakesh.PriorityQueue;

import java.util.PriorityQueue;

public class PurchaseMaxItemsUsingHeap {
	
	public static int maxItems(int[] costs, int sum)
	{
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		for(int i=0;i<costs.length;i++)
		{
			minHeap.add(costs[i]);
		}
		int cnt=0;
		int remainingSum = sum;
		while(!minHeap.isEmpty())
		{
			if(minHeap.peek()>remainingSum)
				break;
			cnt++;
			remainingSum-=minHeap.poll();
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] costs = {1, 12, 5, 111, 200};
		int sum =10;
		
		System.out.println("Maximum items that can be purchased : "+maxItems(costs,sum));
	}
}

// The time complexity to build a max/min heap from an unsorted array of size n using the Heapify method is O(n).
// Time complexity ---> O(n) + O(n*logn)
// Auxiliary Space ---> O(n)
