package com.rakesh.String;

public class AnagramCheckOptimised {
	public static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		int[] characters = new int[256];
		
		for(int i=0;i<s1.length();i++)
		{
			characters[s1.charAt(i)]++;
			characters[s2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
		{
			if(characters[i]!=0)
					return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1 ="listen";
		String s2 ="silent";
		
		System.out.println(isAnagram(s1,s2));
	}

}
// Time Complexity ----> O(n)
// Auxiliary Space ---> O(256)