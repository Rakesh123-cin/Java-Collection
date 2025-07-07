package com.rakesh.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(12);
		set.add(35);
		set.add(56);
		set.add(75);
		set.add(28);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		set.remove(75);
		
		System.out.println(set.contains(35));
		
		for(int x:set)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		System.out.println(set.size());
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(15);
		list1.add(17);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(15);
		list2.add(12);
		list2.add(17);
		
		Set<ArrayList<Integer>> s = new HashSet<>();
		s.add(list1);
		s.add(list2);
		
		System.out.println(s.size());
		
		for(List<Integer> l : s)
		{
			for(int x:l)
			{
				System.out.print(x+" ");
			}
		}
	}

}
