package com.rakesh.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElementUsingMaxHeap {

	public static void kLargeElements(Integer[] arr, int k)
	{
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			maxHeap.add(arr[i]);
		}
		for(int i=1;i<=k;i++)
		{
			System.out.print(maxHeap.poll()+" ");
		}
	}
	public static void main(String[] args) {
		Integer[] arr = {5, 15, 10, 20, 8};
		int k = 2;
		kLargeElements(arr,k);
	}

}


// Time Complexity -----> O(n) + O(k*logn)
// Auxiliary Space -----> O(n)