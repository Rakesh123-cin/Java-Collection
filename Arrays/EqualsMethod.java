package com.rakesh.Arrays;

import java.util.Arrays;

public class EqualsMethod {

	public static void main(String[] args) {
		
		// 1. Basic equality check
		int[] a = {10,25,42};
		int[] b = {10,25,42};
		int[] c = {25,10,42};
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println(Arrays.equals(a,c));
		
		// 2. Equality check with null elements
		
		Integer[] a1 = {10,15,30,null};
		Integer[] b1 = {10,15,30,null};
		
		System.out.println(Arrays.equals(a1,b1));
		
		// 3. Subarray equality check
		
		Integer[] a2= {10,20,30,40,50};
		Integer[] b2 = {30,40,50,70,80};
		
		System.out.println(Arrays.equals(a2,2,5,b2,0,3));
		
		// 4. Equality check for non-primitive types using comparator
		
		String[] s1 = {"RAKESH","RAHUL"};
		String[] s2 = {"rakesh","rahul"};
		
		System.out.println(Arrays.equals(s1,s2,String::compareToIgnoreCase));

	}

}
