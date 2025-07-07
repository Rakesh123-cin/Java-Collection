package com.rakesh.HashSetLinkedHashSet;

import java.util.HashSet;

public class IntersectionOfTwoArraysOptimised {
	
	public static void intersectionOfArray(int[] a, int[] b)
	{
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			set1.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			set2.add(b[i]);
		}
		
		for(int x: set1)
		{
			if(set2.contains(x))
			{
				System.out.print(x+" ");
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {10, 15, 20, 25, 30, 30, 50};
		int b[] = {30, 5, 15, 80};
		
		intersectionOfArray(a,b);
	}

}

// Time Complexity ----> O(n+m)
// Auxiliary Space =====> O(n+m)
