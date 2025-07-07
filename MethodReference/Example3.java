package com.rakesh.MethodReference;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		String[] s1 = {"RAKESH","SRIJAN","ABHISHEK"};
		String[] s2 = {"rakesh","srijan","abhishek"};
		
		//Using lambda expression
		if(Arrays.equals(s1,s2,(x1,x2)->x1.compareToIgnoreCase(x2)))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		System.out.println("----------------");
		
		//Using method reference
		if(Arrays.equals(s1,s2,String::compareToIgnoreCase))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
