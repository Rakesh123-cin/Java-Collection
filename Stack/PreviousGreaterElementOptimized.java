package com.rakesh.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElementOptimized {
	public static void previousGE(int[] arr)
	{
		Stack<Integer> st = new Stack<>();
		st.push(arr[0]);
		System.out.print(-1+" ");
		for(int i=1;i<arr.length;i++)
		{
			while(!st.isEmpty()  && arr[i]>=st.peek() )
			{
				st.pop();
			}
			if(st.isEmpty())
				System.out.print(-1+" ");
			else
				System.out.print(st.peek()+" ");
			st.push(arr[i]);
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

// Time complexity ---> O(n)
// Space Complexity ---> O(n)
