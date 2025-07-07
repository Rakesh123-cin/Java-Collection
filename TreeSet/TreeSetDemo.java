package com.rakesh.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(15);
		set.add(12);
		set.add(4);
		set.add(20);
		set.add(18);
		set.add(25);
		set.add(14);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		System.out.println(set.contains(12));
		
		set.remove(14);
		
		System.out.println(set.lower(20));
		System.out.println(set.higher(20));
		
		System.out.println(set.floor(5));
		System.out.println(set.ceiling(5));
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(18));
		System.out.println(set.tailSet(18));
}

}
