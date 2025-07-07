package com.rakesh.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		
		Set<Integer> s2 = new HashSet<>();
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		
		// 1. Union
		s1.addAll(s2);
		System.out.println(s1);
		
		// 2. Intersection
		s1.retainAll(s2);
		System.out.println(s1);
		
		// 3. Difference
		s1.removeAll(s2);
		System.out.println(s1);
		
		// Remove all duplicates from a collection
		
		Integer[] arr = {21,34,56,32,34,56,75};
		Set<Integer> s = new HashSet<>(Arrays.asList(arr));
		System.out.println(s);
	}

}
