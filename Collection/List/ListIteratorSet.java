package com.rakesh.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorSet {
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext())
		{
			int x = it.next();
			it.set(x*2);
		}
		System.out.println(list);
	}
}
