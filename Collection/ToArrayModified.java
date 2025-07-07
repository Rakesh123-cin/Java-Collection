package com.rakesh.Collection;
import java.util.*;

public class ToArrayModified {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(42);
		list.add(23);
		
		Integer[] arr = new Integer[0];
		arr = list.toArray(arr);
		for(int x: arr)
			System.out.println(x);
	}

}
