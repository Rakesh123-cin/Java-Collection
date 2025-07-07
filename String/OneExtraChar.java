package com.rakesh.String;

import java.util.Arrays;

public class OneExtraChar {
	public static char findExtraChar(String s1, String s2)
	{
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<s1.length();i++)
		{
			if(arr1[i]!= arr2[i])
				return arr2[i];
		}
		
		return arr2[s1.length()];
	}
	public static void main(String[] args) {
		String str1 = "kxml";
		String str2 = "klxml";
		
		System.out.print(findExtraChar(str1,str2));
	}

}

// Time Complexity ----> O(n*logn)+O(m*logm)+O(m)
// Auxiliary Space ----> O(n+m)
