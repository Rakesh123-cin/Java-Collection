package com.rakesh.ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
		super("Grow up kid.....");
	}
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}

public class CustomException {
	
	public static void readyToVote(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException();
		System.out.println("Vote for your right....");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try{
			readyToVote(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Application terminated.....");
		}
	}
}
