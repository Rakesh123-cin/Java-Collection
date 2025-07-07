package com.rakesh.TreeSet;

import java.util.TreeSet;

public class CeilingOnRightOptimised {
	
	public static void ceilingValue(int[] arr)
	{
		int res[] = new int[arr.length];
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(set.ceiling(arr[i])==null)
			{
				res[i]=-1;
			}
			else
			{
				res[i]=set.ceiling(arr[i]);
			}
			set.add(arr[i]);
		}
		for(int x:res)
			System.out.print(x+" ");
	}
	public static void main(String[] args) {
		int arr[] = {10, 100, 200, 30, 120, 120};
		ceilingValue(arr);
	}

}

// Time Complexity ----> O(n*logn)
// Space Complexity ----> O(n)