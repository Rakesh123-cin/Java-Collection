package com.rakesh.Collection;
import java.util.*;

public class ToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(42);
		list.add(23);
		
		Object[] arr = list.toArray();
		for(Object x:arr)
		{
			System.out.println(x);
		}
	}

}
