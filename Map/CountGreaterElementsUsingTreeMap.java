package com.rakesh.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

public class CountGreaterElementsUsingTreeMap {
	
	public static List<Integer> countGreater(int[] arr)
	{
		List<Integer> list = new ArrayList<>();
		TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		
		int cumFreq=0;
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			int freq = entry.getValue();
			map.put(entry.getKey(),cumFreq);
			cumFreq = cumFreq+freq;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			list.add(map.get(arr[i]));
		}
		return list;
	}
	public static void main(String[] args) {
		
		int[] arr = {10, 5, 8, 20, 15, 30, 8};
		
		System.out.println(countGreater(arr));
	}

}

// Time Complexity ---> O(n*logn)
// Auxiliary Space ----> O(n)
