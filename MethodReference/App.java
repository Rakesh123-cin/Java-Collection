package com.rakesh.MethodReference;

public class App {
	public static void main(String[] args)
	{
		System.out.println("Learning method reference");
		
		//Using lambda exp
		Course c1 = ()->System.out.println("I am reistering JavaScript course");
		c1.registerCourse();
		
		//Using Method ref
		Course c2 = Institute::registerJava;
		c2.registerCourse();
		
		Institute i = new Institute();
		
		Course c3 = i::registerPython;
		c3.registerCourse();
	}
}
