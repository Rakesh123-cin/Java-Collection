package com.rakesh.Collection.List;
import java.util.*;

public class ListIteratorForward {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
