package com.rakesh.ExceptionHandling;

import java.util.Scanner;

public class TryCatchDemo {
	public static void main(String[] args)
	{
		System.out.println("Started.....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("Division is "+ (n1/n2));
		}
		catch(ArithmeticException e)
		{
			System.out.println("n2 cann't be zero");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("In finally block: always executed");
		}
		System.out.println("Terminated....");
	}
}
