package com.rakesh.TreeSet;

public class CeilingOnRight {
	
	public static void ceilingValue(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int currentValue =Integer.MAX_VALUE;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>=arr[i])
				{
					if(arr[j]<currentValue)
						currentValue=arr[j];
				}
			}
			if(currentValue==Integer.MAX_VALUE)
				System.out.print(-1+" ");
			else
				System.out.print(currentValue+" ");
		}
		System.out.print(-1);
	}
	public static void main(String[] args) {
		int arr[] = {100, 50, 30, 60, 55, 32};
		ceilingValue(arr);
	}

}
// Time Complexity ------> O(n*n)
// Auxiliary Space -------> O(1)