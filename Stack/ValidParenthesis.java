package com.rakesh.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
	
	public static int checkValidParenthesis(String str)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			Character ch = str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[')
			{
				st.push(ch);
			}
			else if(ch==')')
			{
				if(!st.isEmpty() && st.peek()=='(')
					st.pop();
				else
					return 0;
			}
			else if(ch=='}')
			{
				if(!st.isEmpty() && st.peek()=='{')
					st.pop();
				else
					return 0;
			}
			else if(ch==']')
			{
				if(!st.isEmpty() && st.peek()=='[')
					st.pop();
				else
					return 0;
			}
		}
		if(st.isEmpty())
			return 1;
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkValidParenthesis(str));
	}

}
