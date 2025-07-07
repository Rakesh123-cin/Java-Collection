package com.rakesh.StreamApi;

import java.util.Arrays;

class Student
{
	private int rollNo;
	private int marks;
	private String name;
	
	public Student(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class StudentMarksAverage {

	public static void main(String[] args) {
		Student[] arr = {new Student(101,74,"Ayush"), new Student(107,94,"Rakseh"), new Student(105,63,"Tushar")};
		double avgMarks = Arrays.stream(arr)
				                .mapToInt(x->x.getMarks())
				                .average()
				                .getAsDouble();
		System.out.println(avgMarks);	                
	}

}
