package com.rakesh.Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementOptimised {
	public static void nextGE(int[] arr)
	{
		Stack<Integer> st = new Stack<>();
		int[] op = new int[arr.length];
		op[arr.length-1] = -1;
		st.push(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--)
		{
			while(!st.isEmpty() && arr[i]>=st.peek())
			{
				st.pop();
			}
			if(st.isEmpty())
				op[i]=-1;
			else
				op[i]=st.peek();
			st.push(arr[i]);
		}
		for(int x:op)
			System.out.print(x+" ");
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
