package com.rakesh.String;

public class StringRotationCheck {
	
	public static boolean isStringRotation(String s1, String s2)
	{
		
		if(s1.equals(s2))
			return true;
		if(s1.length()!=s2.length())
			return false;
		
		// 1. Approach-1
		
//		String temp1=s1;
//		
//		for(int itr=1;itr<s1.length();itr++)
//		{
//			String temp2="";
//			for(int i=1;i<temp1.length();i++)
//			{
//				temp2=temp2+temp1.charAt(i);
//			}
//			temp2+=temp1.charAt(0);
//			
//			if(temp2.equals(s2))
//				return true;
//			
//			temp1=temp2;
//		}
		
		// 2. Approach-2 using substring() method
//		for(int i=1;i<s1.length();i++)
//		{
//			char ch = s1.charAt(0);
//			s1=s1.substring(1)+ch;
//			if(s1.equals(s2))
//				return true;
//		}
		
		// 3. Approach-3 If a string is concatenated with itself then it contains all possible set of its rotation.
		
		s1= s1+s1;
		if(s1.contains(s2))
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "acbd";
		
		System.out.println(isStringRotation(s1,s2));
	}

}

//Time complexity -----> O(n*n)
//Auxiliary Space ----> O(1)
