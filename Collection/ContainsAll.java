package com.rakesh.Collection;
import java.util.*;

public class ContainsAll {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(45);
		list1.add(50);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(12);
		set1.add(45);
		set1.add(50);
		
		System.out.println(list1.containsAll(set1));

	}

}
