package com.rakesh.ConstructorReference;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Learning constructor reference");
		
		//Using lambda exp
		Producer p1 = ()->{return new Student();};
		Student s1 = p1.getStudent();
		s1.display();
		
		//Using constructor ref
		Producer p2 = Student::new;
		Student s2 = p2.getStudent();
		s2.display();
	}

}
