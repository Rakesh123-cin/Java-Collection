package com.rakesh.Map;

import java.util.ArrayList;
import java.util.List;

class Item
{
	private int price;
	private String name;
	
	public Item()
	{
		
	}
	
	public Item(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class MyDS
{
	List<Item> list;
	
	public MyDS()
	{
		list= new ArrayList<Item>();
	}
	
	// 1. add(price, item)
	public void add(int price, String item)
	{
		int i;
		
		for(i=0;i<list.size();i++)
		{
			if(price<=list.get(i).getPrice())
			{
				list.add(i,new Item(price,item));
				break;
			}
		}
		if(list.isEmpty() || i==list.size())
			list.add(new Item(price,item));
	}
	
	// 2. find(price)
	public String find(int price)
	{
		int s = 0;
		int e = list.size()-1;
		while(s<=e)
		{
			int mid = (s+e)/2;
			if(price==list.get(mid).getPrice())
			{
				return list.get(mid).getName();
			}
			else if(price<list.get(mid).getPrice())
			{
				e=mid-1;
			}
			else
				s=mid+1;
		}
		return null;
	}
	
	// 3. printSorted()
	public void printSorted()
	{
		for(Item x:list)
		{
			System.out.println(x.getName()+" : "+x.getPrice());
		}
	}
	
	// 4.printGreaterSorted(price)
	public void printGreaterSorted(int price)
	{
		int s = 0;
		int e = list.size()-1;
		int idx=-1;
		//Binary search
		while(s<=e)
		{
			int mid = (s+e)/2;
			if(price==list.get(mid).getPrice())
			{
				idx=mid;
				break;
			}
			else if(price<list.get(mid).getPrice())
			{
				e=mid-1;
			}
			else
				s=mid+1;
			idx=mid;
		}
		for(int i=idx;i<list.size();i++)
		{
			if(list.get(i).getPrice()>price)
				System.out.print(list.get(i).getName()+" ");
		}
	}
	
	// 5.printSmallerSorted(price)
		public void printSmallerSorted(int price)
		{
			int s = 0;
			int e = list.size()-1;
			int idx=-1;
			//Binary Search
			while(s<=e)
			{
				int mid = (s+e)/2;
				if(price==list.get(mid).getPrice())
				{
					idx=mid;
					break;
				}
				else if(price<list.get(mid).getPrice())
				{
					e=mid-1;
				}
				else
					s=mid+1;
				idx=mid;
			}
			for(int i=0;i<=idx;i++)
			{
				if(list.get(i).getPrice()<price)
					System.out.print(list.get(i).getName()+" ");
			}
		}
}

public class DesignDS {

	public static void main(String[] args) {
		MyDS ds = new MyDS();
		ds.add(25,"Banana");
		ds.add(15,"Watermelon");
		ds.add(40, "Papaya");
		
		System.out.println(ds.find(15));
		ds.printSorted();
		ds.printSmallerSorted(45);
	}

}
