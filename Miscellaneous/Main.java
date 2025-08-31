package com.rakesh.Miscellaneous;

public class Main {
	
	public static void main(String[] args)
	{
		StudentMethodChaining obj = StudentMethodChaining.of()
														.setName("Rakesh Anand")
														.setAge(24)
														.setAddress("Darbhanga");
		
		System.out.println(obj);
		
	}
}
