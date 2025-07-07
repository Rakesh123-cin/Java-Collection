package com.rakesh.MethodReference;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,34,98,100,23,45);
		
		//Using lambda expression
		l.forEach(x->Example2.printSquare(x));
		
		System.out.println("-----------------------");
		
		//Using method reference
		l.forEach(Example2::printSquare);
	}
	public static void printSquare(int x)
	{
		System.out.println(x*x);
	}
}
