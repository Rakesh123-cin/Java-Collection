package com.rakesh.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblemOptimised {
	
	public static void spanOfStock(int[] arr)
	{
		System.out.print(1+" ");
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i=1;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]>=arr[st.peek()])
			{
				st.pop();
			}
			if(st.isEmpty())
				System.out.print((i+1) +" ");
			else
				System.out.print((i-st.peek())+" ");
			st.push(i);
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
//Time complexity ---> O(n*n)
//Space Complexity ---> O(n)
