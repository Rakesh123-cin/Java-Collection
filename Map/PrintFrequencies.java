package com.rakesh.Map;

public class PrintFrequencies {
	public static void printFrequency(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					break;
				}
			}
			if(flag)
				continue;
			int cnt = 1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					cnt++;
				}
			}
			System.out.println(arr[i]+" : "+cnt);
		}
	}
	public static void main(String[] args) {
		int arr[] = {10, 15, 20, 15, 10, 15};
		printFrequency(arr);
	}

}
//Time Complexity ----> O(n*n)
// Auxiliary Space ----> O(1)
