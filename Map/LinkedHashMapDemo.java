package com.rakesh.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LinkedHashMapDemo {
	
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		map.put(101, "Aman");
		map.put(102,"Rakesh");
		map.put(103, "Rahul");
		map.put(110,"Shivam");
		map.put(105,"Ashutosh");
		map.put(107,"Hari");
		
		Set<Map.Entry<Integer,String>> entries = map.entrySet();
		for(Map.Entry<Integer, String> entry : entries)
		{
			System.out.println(entry.getKey()+" : " +entry.getValue());
		}
		
		LinkedHashMap<String,String> specialMap = new LinkedHashMap<>(4,0.6f,true);
		specialMap.put("Rakesh", "Software Eng.");
		specialMap.put("Rahul","Teacher");
		specialMap.put("Ravi", "BusinessMan");
		
		System.out.println(specialMap.get("Rahul"));
		System.out.println(specialMap.get("Rakesh"));
		
		
		Set<Map.Entry<String,String>> accessOrder = specialMap.entrySet();
		for(Map.Entry<String, String> entry : accessOrder)
		{
			System.out.println(entry.getKey()+" : " +entry.getValue());
		}
		
		
	}

}
