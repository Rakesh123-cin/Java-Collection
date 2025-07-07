package com.rakesh.Collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(45);
		list1.add(50);
		list1.add(61);
		
		list1.removeIf(x->x%2!=0);
		System.out.println(list1);
	}

}
