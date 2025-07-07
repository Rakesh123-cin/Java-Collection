package com.rakesh.PriorityQueue;

import java.util.Arrays;
import java.util.Collections;

public class KLargestElement {
	
	public static void kLargeElements(Integer[] arr, int k)
	{
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<k;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Integer[] arr = {8, 6, 4, 10, 9};
		int k = 3;
		kLargeElements(arr,k);
	}

}


// Time complexity -----> O(n*logn) + O(k)
// Auxiliary Space ----> O(1)