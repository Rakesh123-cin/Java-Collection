package com.rakesh.ExceptionHandling;

public class ThrowThrowsExcep {
	
	public static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun() ");
		throw new IllegalAccessException();
	}
	public static void main(String[] args) {
		try {
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main");
		}
	}
}
