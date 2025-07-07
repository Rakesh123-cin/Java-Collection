package com.rakesh.String;

import java.util.Arrays;

public class AnagramCheck {
	
	public static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
//		for(int i=0;i<s1.length();i++)
//		{
//			if(arr1[i]!=arr2[i])
//				return false;
//		}
		
		if(Arrays.equals(arr1,arr2))
			return true;
		
		return false;
	}
	public static void main(String[] args)
	{
		String s1 ="listen";
		String s2 ="silent";
		
		System.out.println(isAnagram(s1,s2));
	}
}

// Time Complexity ----> O(n*logn + m*logm)
// Auxiliary Space ----> O(n+m)
