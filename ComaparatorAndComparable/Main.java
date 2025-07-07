package com.rakesh.ComaparatorAndComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(101,"Rakesh"));
		studs.add(new Student(143,"Anmol"));
		studs.add(new Student(110,"Riya"));
		
		Collections.sort(studs);
		System.out.println(studs);
		
		Student[] studArr = {new Student(121,"Rahul"),new Student(145,"Amrit"),new Student(110,"Riya")};
		//Arrays.sort(studArr, new MyComparator());
		
		
		//Using Lambda function
		Arrays.sort(studArr, (s1,s2)->s1.getRollNo()-s2.getRollNo());
		Arrays.sort(studArr,(s1,s2)->s1.getName().compareToIgnoreCase(s2.getName()));

		System.out.println(Arrays.toString(studArr));
	}
}
