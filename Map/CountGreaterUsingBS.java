package com.rakesh.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountGreaterUsingBS {
	public static List<Integer> countGreater(int[] arr)
	{
		List<Integer> list = new ArrayList<>();
		int[] sortedArray = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			sortedArray[i]=arr[i];
		}
		Arrays.sort(sortedArray);
		for(int i=0;i<arr.length;i++)
		{
			int cnt = 0;
			int start = 0;
			int end = arr.length-1;
			while(start<=end)
			{
				int mid = (start+end)/2;
				if(sortedArray[mid]>arr[i])
				{
					cnt = (end-mid+1)+cnt;
					end=mid-1;
				}
				else
					start=mid+1;
			}
			list.add(cnt);
		}
		return list;
	}
	public static void main(String[] args) {
		int[] arr = {10, 5, 8, 20, 30, 8};
		
		System.out.println(countGreater(arr));
	}

}

// Time Complexity ----> O(n*logn)
// Auxiliary Space ----> O(n)
