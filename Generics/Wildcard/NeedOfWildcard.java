package com.rakesh.Generics.Wildcard;
import java.util.*;

class Student2
{
	
}

class EngineeringStudent2 extends Student2
{
	
}

public class NeedOfWildcard {

	public static void main(String[] args) {
		Student2[] arr1 = new Student2[5];
		EngineeringStudent2[] arr2 = new EngineeringStudent2[5];
		arr1 = arr2;
		
		List<Student2> l1 = new ArrayList<Student2>();
		List<EngineeringStudent2> l2 = new ArrayList<EngineeringStudent2>();
		//l1 = l2;
	}

}
