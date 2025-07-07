package com.rakesh.HashSetLinkedHashSet;

import java.util.HashSet;

public class PrintReapeatingOptimised {
	
	public static void printRepeating(int[] arr)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
			set.add(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 8, 10, 7, 7, 7, 6};
		printRepeating(arr);
	}

}
