package com.rakesh.String;

public class PanagramCheck {

	public static boolean isPanagram(String str) {
		if(str.length()<26)
			return false;
		
		int[] alphabet = new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				alphabet[ch-'a']++;
			}
			
			if(ch>='A' && ch<='Z')
			{
				alphabet[ch-'A']++;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(alphabet[i]==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String str ="The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(str));
	}

}

// Time Complexity -----> O(n)
// Auxiliary Space -----> O(1)