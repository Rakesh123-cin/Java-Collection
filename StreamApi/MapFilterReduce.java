package com.rakesh.StreamApi;

import java.util.*;

//Find the sum of squares of all even no from a list
public class MapFilterReduce {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(8,7,5,9,2,6);
		int result = l.stream()
				      .filter(x->x%2==0)
				      .map(x->x*x)
				      .reduce(0,(x1,x2)->x1+x2);
		System.out.println(result);
	}

}
