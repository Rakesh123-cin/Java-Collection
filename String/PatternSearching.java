package com.rakesh.String;

import java.util.ArrayList;
import java.util.List;

public class PatternSearching {
	
	public static List<Integer> patternSearch(String text, String word)
	{
		List<Integer> list = new ArrayList<>();
		
		if(word.length()>text.length())
			return list;
		
//		int initial =0;
//		while(initial<=(text.length()-word.length()))
//		{
//			    int ptr=initial;
//			    int j;
//				for(j=0;j<word.length() && ptr<text.length() ;j++)
//				{
//					if(word.charAt(j)!=text.charAt(ptr))
//					{
//						break;
//					}
//					else
//					{
//						ptr++;
//					}
//				}
//				if(j==word.length())
//				{
//					list.add(initial);
//					initial=initial+1;
//				}
//				else
//				{
//					initial=ptr+1;
//				}
//		}
//		
		// Using indexOf() method
		
		for(int i=0;i<=(text.length()-word.length());) {
			
			int idx = text.indexOf(word,i);
			
			if(idx==-1)
			{
				return list;
			}
			if(idx>=0)
			{
				list.add(idx);
				i=idx+1;
			}
				
		}	
		return list;
	}
	public static void main(String[] args) {
		String text = "aaaaaa";
		String word="aaa";
		
		List<Integer> pos = patternSearch(text,word);
		
		System.out.println("The result is ---");
		
		for(int x:pos)
		{
			System.out.print(x+" ");
		}
	}

}

// Time Complexity -----> O(n*m)
// Auxiliary space ----> O(1)
