package com.rakesh.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CommonElementsOptimised {
	
	public static List<Integer> getCommonElements(int[] arr1, int[] arr2)
	{
		TreeMap<Integer,Integer> map1 = new TreeMap<>();
		TreeMap<Integer,Integer> map2 = new TreeMap<>();
		TreeMap<Integer,Integer> map3 = new TreeMap<>();
		
		ArrayList<Integer> sortedList = new ArrayList<>();
		
		for(int x:arr1)
		{
			map1.put(x, map1.getOrDefault(x,0)+1);
		}
		for(int x:arr2)
		{
			map2.put(x, map2.getOrDefault(x,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry: map1.entrySet())
		{
			if(map2.containsKey(entry.getKey()))
			{
				map3.put(entry.getKey(), Math.min(entry.getValue(), map2.get(entry.getKey())));
			}
		}
		for(Map.Entry<Integer,Integer> entry: map3.entrySet())
		{
			for(int i=1;i<=entry.getValue();i++)
			  sortedList.add(entry.getKey());
			
		}
		return sortedList;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {9, 7, 3, 4, 9};
		int[] arr2 = {3, 6, 1, 7, 9, 8, 2, 2};
		
		List<Integer> sortedList = getCommonElements(arr1,arr2);
		for(int x : sortedList)
		{
			System.out.print(x+" ");
		}
	}

}

// Time Complexity -----> O(n*logn)+O(m*logm)+O(n*logm)
// Auxiliary Space ----> O(n+m)
