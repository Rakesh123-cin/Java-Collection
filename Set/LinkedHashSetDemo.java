package com.rakesh.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(24);
		set.add(50);
		set.add(42);
		set.add(67);
		
		for(int x:set)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		System.out.println(set.contains(55));
		
		set.remove(42);
		
		set.forEach(x->System.out.print(x+" "));
	}

}
