package com.rakesh.Generics.Wildcard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Student3
{
	
}

class EngineeringStudent3 extends Student3
{
	
}

public class UpperBoundLowerBound {

	public static void main(String[] args) {
		List<? extends Student3> l1 = new ArrayList<>(); //upper bounded wildcard
		List<EngineeringStudent3> l2 = new ArrayList<EngineeringStudent3>();
		l1 = l2;
		
		List<? super Student3> l3 = new LinkedList<>(); // lower bounded wildcard
		List<Object> l4 = new LinkedList<Object>();
		l3 = l4;
	}

}
