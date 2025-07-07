package com.rakesh.PriorityQueue;

import java.util.PriorityQueue;

public class KLargestElementUsingMinHeap {
	
	public static void kLargeElements(Integer[] arr, int k)
	{
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			minHeap.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]>minHeap.peek())
			{
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		for(int x: minHeap)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		Integer[] arr = {8, 6, 4, 10, 9};
		int k = 3;
		kLargeElements(arr,k);
	}

}
// Time Complexity -----> O(k) + O((n-k)*logk)
// Auxiliary Space -----> O(k)