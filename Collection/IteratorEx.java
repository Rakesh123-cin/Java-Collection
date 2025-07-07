package com.rakesh.Collection;
import java.util.*;

public class IteratorEx {
	
	public static void removeEven(Collection<Integer> c)
	{
		Iterator<Integer> it = c.iterator();
		while(it.hasNext())
		{
			Integer x = it.next();
			if(x%2==0)
			{
				it.remove(); 
			}
		}
	}
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(12);
		c.add(15);
		c.add(34);
		
		removeEven(c);
		
		c.forEach(System.out::println);

	}

}
