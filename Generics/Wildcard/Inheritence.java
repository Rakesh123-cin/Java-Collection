package com.rakesh.Generics.Wildcard;

class Student1
{
	
}

class EngineeringStudent1 extends Student1
{
	
}

public class Inheritence {

	public static void main(String[] args) {
		Student1 s = new Student1();
		EngineeringStudent1 e = new EngineeringStudent1();
		
		s = e; // Since, Student is a parent of EngineeringStudent

	}

}
