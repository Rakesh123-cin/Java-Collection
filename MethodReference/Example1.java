package com.rakesh.MethodReference;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12,34,67,21,11);
		
		//Using lambda expression
		l.forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		//Using method reference
		l.forEach(System.out::println);
	}

}
