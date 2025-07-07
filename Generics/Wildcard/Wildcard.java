package com.rakesh.Generics.Wildcard;
import java.util.*;

class Student
{
	
}

class EngineeringStudent extends Student
{
	
}

public class Wildcard {
	
	public static void main(String[] args) {
		List<?> l1 = new ArrayList<>();
		List<EngineeringStudent> l2 = new ArrayList<EngineeringStudent>();
		l1 = l2;
	}

}
