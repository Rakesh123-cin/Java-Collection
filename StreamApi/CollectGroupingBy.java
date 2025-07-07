package com.rakesh.StreamApi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

//class Student
//{
//	private int rollNo;
//	private int marks;
//	private String name;
//	
//	public Student(int rollNo, int marks, String name) {
//		super();
//		this.rollNo = rollNo;
//		this.marks = marks;
//		this.name = name;
//	}
//
//	public int getRollNo() {
//		return rollNo;
//	}
//
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//
//	public int getMarks() {
//		return marks;
//	}
//
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
//	}
//	
//}

public class CollectGroupingBy {

	public static void main(String[] args) {
		Student[] arr = {new Student(101,70,"Ayush"), new Student(107,94,"Rakseh"), new Student(105,70,"Tushar")};
		Map<Integer,List<Student>> map = Arrays.stream(arr)
				                               .collect(Collectors.groupingBy(x->x.getMarks()));
		System.out.println(map);
	}

}
