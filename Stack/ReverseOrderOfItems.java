package com.rakesh.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ReverseOrderOfItems {
	public static ArrayList<Integer> reverseItems(ArrayList<Integer> list)
	{
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int x :list)
		{
			stack.push(x);
		}
		for(int i=0;i<list.size();i++)
		{
			list.set(i,stack.pop());
		}
		return list;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		list.add(6);
		list.add(42);
		System.out.println(list);
		list = reverseItems(list);
		System.out.println(list);
	}

}
