package com.rakesh.Generics;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class GenericFunction {
//	public static <T> int count(T[] arr, T x)
//	{
//		int result=0;
//		for(T t : arr)
//		{
//			if(t.equals(x))
//				result++;
//		}
//		return result;
//	}
//	public static void main(String[] args) {
//		Integer[] arr = {10,20,30,32,10,45};
//		System.out.println(count(arr,10));
//	}
	
	public static <T> void printCollection(Collection<T> c)
	{
		for(T x:c)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		List<Double> l = new LinkedList<Double>();
		l.add(42.01);
		l.add(30.12);
		l.add(21.03);
		printCollection(l);
	}


}
