package com.rakesh.Arrays;

import java.util.Comparator;
import java.util.Arrays;

class Point{
	private int x;
	private int y;
	
	Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}

class MyComp implements Comparator<Point>
{
	public int compare(Point p1,Point p2)
	{
		return p1.getX()-p2.getX();
	}
}

public class BinarySearchComparartor {
	public static void main(String[] args)
	{
		Point[] arr = {new Point(10,20), new Point(15,10), new Point(18,25), new Point(30,10)};
		
		Point p = new Point(30,10);
		
		//System.out.println(Arrays.binarySearch(arr,p, new MyComp()));
		
		// Using lambda exp
		
		System.out.println(Arrays.binarySearch(arr,p, (p1,p2)->p1.getX()-p2.getX()));
		
	}
}
