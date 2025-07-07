package com.rakesh.Generics.Wildcard;
import java.util.*;

class Emp
{
	public void print()
	{
		System.out.println("I am an employee");
	}
}

class TechnicalEmp extends Emp
{
	@Override
	public void print()
	{
		System.out.println("I am a technical employee");
	}
}

class SalesEmp extends Emp
{
	@Override
	public void print()
	{
		System.out.println("I am a sales employee");
	}
}

public class Example {
	public static void printCollection(List<? extends Emp> list)
	{
		for(Emp e:list)
		{
			e.print();
		}
	}
	public static void main(String[] args) {
		List<TechnicalEmp> e1 = new ArrayList<>();
		e1.add(new TechnicalEmp());
		e1.add(new TechnicalEmp());
		
		List<SalesEmp> e2 = new ArrayList<>();
		e2.add(new SalesEmp());
		e2.add(new SalesEmp());
		
		printCollection(e1);
		printCollection(e2);
	}

}
