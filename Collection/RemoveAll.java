package com.rakesh.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveAll {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(45);
		list1.add(50);
		list1.add(50);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(12);
		set1.add(50);
		
		list1.removeAll(set1);
		System.out.println(list1);
	}

}
