package com.rakesh.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class MyDSUsingTreeMap
{
	TreeMap<Integer,List<String>> map;
	
	public MyDSUsingTreeMap()
	{
		map = new TreeMap<>();
	}
	
	// 1. add(price,item)
	public void add(int price, String item)
	{
		if(map.get(price)==null)
		{
			ArrayList<String> list = new ArrayList<>();
			map.put(price, list);
		}
		map.get(price).add(item);
	}
	
	// 2. find(price)
	public List<String> find(int price)
	{
		return map.get(price);
	}
	
	// 3. printSorted()
	public void printSorted()
	{
		for(Map.Entry<Integer,List<String>> entry : map.entrySet())
		{
			for(String x: entry.getValue())
			{
				System.out.print(x+" ");
			}
			System.out.println(": "+entry.getKey());
		}
	}
	
	// 4. printGreaterSorted(price)
	public void printGreaterSorted(int price)
	{
		SortedMap<Integer,List<String>> sortedMap = map.tailMap(price);
		for(Map.Entry<Integer,List<String>> entry: sortedMap.entrySet())
		{
			if(price==entry.getKey())
				continue;
			for(String x : entry.getValue())
			{
				   System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	
	// 5. printSmallerSorted(price)
	public void printSmallerSorted(int price)
	{
		SortedMap<Integer,List<String>> sortedMap = map.headMap(price);
		for(Map.Entry<Integer,List<String>> entry : sortedMap.entrySet())
		{
			
			for(String x : entry.getValue())
			{
				
				   System.out.print(x+" ");
			}
			System.out.println();
			
		}
	}
}

public class DesignMyDS {

	public static void main(String[] args) {
		MyDSUsingTreeMap ds = new MyDSUsingTreeMap();
		ds.add(30,"Papaya");
		ds.add(70,"Apple");
		ds.add(15,"Watemelon");
		ds.add(30,"Banana");
		
		ds.printSorted();
		ds.printSmallerSorted(30);
		ds.printGreaterSorted(30);
	}

}
