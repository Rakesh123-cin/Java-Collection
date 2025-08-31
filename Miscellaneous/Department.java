package com.rakesh.Miscellaneous;

public record Department(int id, String name, float salary) {
	
	// getters
	// toString
	// hashCode
	// equals
	
	// Custom constructor
	public Department()
	{
		this(101,"Support",25000);
	}
	
	// Custom instance method
	public void overview()
	{
		System.out.println("You have been assigned to "+name+" department");
	}
	
	// Custom static method
	public static void display()
	{
		System.out.println("Various Departments like : HR, Tech, Support, Sales");
	}
}
