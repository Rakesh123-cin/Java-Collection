package com.rakesh.Map;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequenciesInOrder {
	public static void printFrequencyInOrder(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i])!=-1) {
			  System.out.println(arr[i]+" : "+map.get(arr[i]));
			  map.put(arr[i], -1);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 10, 10, 20};
		printFrequencyInOrder(arr);
	}

}


// Time Complexity : O(2*n) = O(n)
// Auxiliary Space : O(n)