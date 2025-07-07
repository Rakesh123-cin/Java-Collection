package com.rakesh.Stack;

import java.util.Arrays;
import java.util.Scanner;

public class PreviousGreaterElement {
        public static void previousGE(int[] arr)
        {
        	System.out.print(-1+" ");
        	for(int i=1;i<arr.length;i++)
        	{
        		int j;
        		for(j=i-1;j>=0;j--)
        		{
        			if(arr[j]>arr[i])
        			{
        				System.out.print(arr[j]+" ");
        				break;
        			}
        		}
        		if(j==-1)
        			System.out.print(-1+" ");
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
			previousGE(arr);
		}

}
//Time complexity ---> O(n*n)
//Space complexity ---> O(1)
