package com.rakesh.Arrays;

import java.util.Arrays;

public class MisMatch {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {10,20,30};
		int[] c = {10,20,40,30};
		
		System.out.println(Arrays.mismatch(a,b));
		System.out.println(Arrays.mismatch(a,c));
		System.out.println(Arrays.mismatch(a,0,2,c,0,2));
		
		String[] s1 = {"java","python"};
		String[] s2 = {"JAVA","JS"};
		System.out.println(Arrays.mismatch(s1,s2,String::compareToIgnoreCase));
	}

}
