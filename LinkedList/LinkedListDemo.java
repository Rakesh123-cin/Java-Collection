package com.rakesh.LinkedList;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(2,63);
		list.set(1,50);
		System.out.println(list.get(1));
		System.out.println(list.indexOf(30));
		System.out.println(list);
		System.out.println(list.size());
	}

}
