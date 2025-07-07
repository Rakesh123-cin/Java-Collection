package com.rakesh.StreamApi;

import java.util.Arrays;

//print strings that starts with "a" and ends with "c" in lexicographic order
public class StringWithAandC {

	public static void main(String[] args) {
		
		String[] arr = {"abc","cde","acd","aec","xyz"};
		Arrays.stream(arr)
			  .filter(x->x.startsWith("a"))
			  .filter(x->x.endsWith("c"))
			  .sorted()
			  .forEach(System.out::println);
	}

}
