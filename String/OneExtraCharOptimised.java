package com.rakesh.String;

public class OneExtraCharOptimised {
	
	public static char findExtraChar(String s1, String s2)
	{
//		int[] alphabets = new int[26];
//		for(int i=0;i<s1.length();i++)
//		{
//			alphabets[s1.charAt(i)-'a']--;
//			alphabets[s2.charAt(i)-'a']++;
//		}
//		alphabets[s2.charAt(s1.length())-'a']++;
//		
//		for(int i=0;i<26;i++)
//		{
//			if(alphabets[i]==1)
//				return (char)(i+'a');
//		}
//		
//		return '\0';
		
		// 2. Using XOR OPERATOR
		int result =0;
		for(int i=0;i<s1.length();i++)
		{
			result = result^s1.charAt(i)^s2.charAt(i);
		}
		return (char)(result^s2.charAt(s1.length()));
	}
	public static void main(String[] args) {
		String str1 = "kxml";
		String str2 = "klxml";
		
		System.out.print(findExtraChar(str1,str2));
	}

}

// Time Complexity ----> O(n)
// Auxiliary Space ----> O(1)
