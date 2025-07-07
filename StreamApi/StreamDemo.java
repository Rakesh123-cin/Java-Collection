package com.rakesh.StreamApi;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,34,53,98,24);
		Stream<Integer> stream = l.stream();
		stream.filter(x->x%2==0)
			  .filter(x->x>30)
			  .forEach(System.out::println);
	}

}
