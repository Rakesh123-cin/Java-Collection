package com.rakesh.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorIndex {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator<Integer> it = list.listIterator(2);
		System.out.println(it.nextIndex());
		System.out.println(it.previousIndex());
	}

}
