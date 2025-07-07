package com.rakesh.Map;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequenciesOptimised {
	
	public static void printFrequency(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
//			if(map.containsKey(arr[i]))
//				map.replace(arr[i],map.get(arr[i])+1);
//			else
//				map.put(arr[i], 1);
			
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 5, 20, 5, 10, 5};
		printFrequency(arr);
	}

}

// Time Complexity ----> O(n)
// Auxiliary Space ----> O(n)