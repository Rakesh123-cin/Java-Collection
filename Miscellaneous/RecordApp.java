package com.rakesh.Miscellaneous;

public class RecordApp {

	public static void main(String[] args) {
		
		Department dept = new Department(121,"Developer",100000);
		
		System.out.println(dept);
		System.out.println(dept.id());
		System.out.println(dept.name());
		System.out.println(dept.salary());
		
		Department dept2 = new Department();
		System.out.println(dept2);
		dept2.overview();
		
		Department.display();
		
		
		
	}

}
