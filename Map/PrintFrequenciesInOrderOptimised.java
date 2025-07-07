package com.rakesh.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFrequenciesInOrderOptimised {
	public static void printFrequencyInOrder(int[] arr)
	{
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 10, 10, 20, 15};
		printFrequencyInOrder(arr);
	}

}


// Time Complexity ----> O(n)
// Auxiliary Space ---> O(n)