package com.rakesh.Stack;
import java.util.Stack;
import java.util.ArrayDeque;

public class StackDemo {
	public static void main(String[] args)
	{
		//Stack<Integer> stack = new Stack<>();
		ArrayDeque<Integer> stackImp = new ArrayDeque<>();
		stackImp.push(10);
		stackImp.push(20);
		stackImp.push(30);
		
		System.out.println(stackImp);
		System.out.println(stackImp.pop());
		System.out.println(stackImp.peek());
		System.out.println(stackImp.isEmpty());
		System.out.println(stackImp.size());
	}
}
