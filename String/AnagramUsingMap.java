package com.rakesh.String;

import java.util.HashMap;
import java.util.Map;

public class AnagramUsingMap {

	public static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s1.length();i++)
		{
			map.put(s1.charAt(i), (map.getOrDefault(s1.charAt(i),0))+1);
			map.put(s2.charAt(i), (map.getOrDefault(s2.charAt(i),0))-1);
		}
		
		for(Map.Entry<Character,Integer> entries : map.entrySet())
		{
			if(entries.getValue()!=0)
				return false;
		}

		return true;
	}
	public static void main(String[] args) {
		String s1 ="liscen";
		String s2 ="silenc";
		
		System.out.println(isAnagram(s1,s2));
	}

}

// Time Complexity ----> O(n)
// Auxiliary space -----> O(n)
