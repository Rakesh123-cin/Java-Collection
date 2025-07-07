package com.rakesh.Collection;
import java.util.*;

public class AddAll {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(12);
		set.add(45);
		set.add(50);
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(41);
		list.add(65);
		
		set.addAll(list);
		System.out.println(set);
		
	}

}
