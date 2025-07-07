package com.rakesh.Stack;

import java.util.Scanner;

public class NextGreterElement {
	public static void nextGE(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int j;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					System.out.print(arr[j]+" ");
					break;
				}
			}
			if(j==arr.length)
				System.out.print(-1+" ");
		}
		System.out.print(-1+" ");
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
		nextGE(arr);
	}

}
