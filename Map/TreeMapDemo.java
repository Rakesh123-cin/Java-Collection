package com.rakesh.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(2,"C++");
		map.put(3,"Java Core");
		map.put(5,"Spring Boot");
		map.put(4,"JS frontend");
		map.put(6,"Data Science");
		
		System.out.println(map);
		
		map.remove(7);
		
		System.out.println(map.get(5));
		
		System.out.println(map.values());
		
		
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println(map.lowerEntry(4).getValue());
		System.out.println(map.higherEntry(5).getValue());
		System.out.println(map.floorEntry(5).getValue());
		System.out.println(map.ceilingEntry(3).getValue());
		
		System.out.println(map.headMap(5));
		System.out.println(map.tailMap(5));
	}

}
