package com.rakesh.HashSetLinkedHashSet;

import java.util.HashSet;

public class PrintDistinctOptimised {

	public static void printDistinctInOrder(int[] arr)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!set.contains(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
			set.add(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {10, 8, 4, 10, 10, 4};
		printDistinctInOrder(arr);
	}

}


// Time Complexity ----> O(n)
// Auxiliary Space ----> O(n)