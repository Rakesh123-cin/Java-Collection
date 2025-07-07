package com.rakesh.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("I");
		list.add("love");
		list.add("programming");
		list.add("especially");
		list.add("in");
		list.add("Java");
		
		System.out.println("Is list empty :" + list.isEmpty());
		System.out.println("Size of the list :" + list.size());
		System.out.println(list);
		list.add(2,"coding and");
		list.set(6,"C++");
		System.out.println(list);
		
		System.out.println("Element at 3rd index "+list.get(3));
		System.out.println("Index of java is :"+list.indexOf("Java"));
		System.out.println("Is programming present :"+list.contains("programming"));
		
		list.add("and java");
		System.out.println(list.remove(list.size()-1));
		 
		// Different ways to iterate through ArrayList
		
		// 1. normal loop
		for(int i=0; i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		// 2. For each loop
		for(String s : list)
		{
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		// 3. Using iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		// 4. foreach method
		
		list.forEach(x->System.out.print(x+" "));
		
	}

}
