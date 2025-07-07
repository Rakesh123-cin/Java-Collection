package com.rakesh.Arrays;

import java.util.Arrays;

public class CompareMethod {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,60};
		int[] b = {10,34,23};
		
		int res = Arrays.compare(a, b);
		
		if(res==0)
			System.out.println("same");
		else if(res>0)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");
	}

}
