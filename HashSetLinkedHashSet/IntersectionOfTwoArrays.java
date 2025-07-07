package com.rakesh.HashSetLinkedHashSet;

public class IntersectionOfTwoArrays {
	
	public static void intersectionOfArray(int[] a, int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = {10, 15, 20, 25, 30, 50};
		int b[] = {30, 5, 15, 80};
		
		intersectionOfArray(a,b);

	}

}


// Time Complexity ----> O(n*m)
// Auxiliary Space ----> O(1)
