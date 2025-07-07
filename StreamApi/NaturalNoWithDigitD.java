package com.rakesh.StreamApi;

import java.util.stream.Stream;

//Print first n natural numbers with given digit d.
public class NaturalNoWithDigitD {

	public static void main(String[] args) {
		Stream.iterate(1,x->x+1)
		      .filter(x->x.toString().contains("4"))
		      .limit(10)
		      .forEach(System.out::println);
	}

}
