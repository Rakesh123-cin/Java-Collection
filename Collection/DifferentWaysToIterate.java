package com.rakesh.Collection;
import java.util.*;

public class DifferentWaysToIterate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(45);
		list.add(50);
		list.add(61);
		
		//1. Using Iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
		
		System.out.println("");
		
		// 2. for-each loop
		for(Integer x: list)
			System.out.print(x+" ");
		
		System.out.println("");
		
		// 3. Using forEach method
		list.forEach(System.out::println);
		
		// 4. Using Stream
		list.stream()
		     .forEach(x->System.out.print(x+ " "));
	}

}
