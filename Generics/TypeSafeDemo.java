package com.rakesh.Generics;

class Point
{
	Object x;
	Object y;
}

//class Point<T1,T2>
//{
//	T1 x;
//	T2 y;
//}

public class TypeSafeDemo {
	
	public static void main(String[] args)
	{
		Point p = new Point();
		//Point<Integer, String> p = new Point();
		p.x = 12;
		p.y = "hello";
		
		String str = (String)p.x;
	}
}
