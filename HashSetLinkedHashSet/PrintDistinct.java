package com.rakesh.HashSetLinkedHashSet;

public class PrintDistinct {

	public static void printDistinctInOrder(int[] arr)
	{
		System.out.print(arr[0]+" ");
		for(int i=1;i<arr.length;i++)
		{
			boolean flag = true;
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {10, 8, 4, 10, 10, 4};
		printDistinctInOrder(arr);
	}

}

// Time Complexity ----> O(n*n)
// Auxiliary Space -----> O(1)
