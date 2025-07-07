package com.rakesh.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		// 1. put method
		map.put(101, "Aman");
		map.put(102,"Rakesh");
		map.put(103, "Rahul");
		map.put(110,"Shivam");
		map.put(105,"Ashutosh");
		map.put(107,"Hari");
		
		// 2. get method
		System.out.println(map.get(110));
		
		// 3. remove method
		System.out.println(map.remove(102));
		
		// 4. containsKey method
		System.out.println(map.containsKey(120));
		
		// 5. containsValue method
		System.out.println(map.containsValue("Rahul"));
		
		// 6. isEmpty method
		System.out.println(map.isEmpty());
		
		// 7. size method
		System.out.println(map.size());
		
		// 8. replace method
		map.replace(107,"Haridwar");
		
		// 9. getOrDefault method
		System.out.println(map.getOrDefault(115, "Ketan"));
		
		// 10. keySet method
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		// 11. values method
		Collection<String> values = map.values();
		System.out.println(values);
		
		// 12. entrySet method
		Set<Map.Entry<Integer,String>> entries = map.entrySet();
		for(Map.Entry<Integer, String> entry : entries)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
