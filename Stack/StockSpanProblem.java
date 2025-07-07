package com.rakesh.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {
	
	public static void spanOfStock(int[] arr)
	{
		System.out.print(1+" ");
		for(int i=1;i<arr.length;i++)
		{
			int j;
			for(j=i-1;j>=0;j--)
			{
				if(arr[j]>arr[i])
					break;
			}
			if(j==-1)
				System.out.print(i+1+" ");
			else
				System.out.print(i-j+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		sc.nextLine();
		int arr[] = new int[n];
		for(int i=0;i< n;i++)
		{
			arr[i]=sc.nextInt();
		}
		spanOfStock(arr);
	}

}

// Time complexity ----> O(n*n)
// Space Complexity ----> O(1)
