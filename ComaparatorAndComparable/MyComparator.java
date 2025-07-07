package com.rakesh.ComaparatorAndComparable;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
	public int compare(Student s1,Student s2)
	{
		return s1.getRollNo()-s2.getRollNo();
	}
}
