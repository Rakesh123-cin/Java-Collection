package com.rakesh.LambdaExpresssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

//Filter even no from a collection
public class WithoutLambdaExp {
	public static void printEven(Collection<Integer> c, Predicate<Integer> p)
	{
		for(Integer x:c)
			if(p.test(x))
				System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>(Arrays.asList(12,15,6,10,43,58,7));
		class MyPredicate implements Predicate<Integer>
		{
			public boolean test(Integer x)
			{
				return x%2==0;
			}
		}
		printEven(list,new MyPredicate());
	}
}
