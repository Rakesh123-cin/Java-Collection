package com.rakesh.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class RotateFirstK {
	
	public static void reverseFirstK(Queue<Integer> q, int k)
	{
		Stack<Integer> st = new Stack<>();
		for(int i=1;i<=k;i++)
		{
			st.push(q.poll());
		}
		while(!st.isEmpty())
		{
			q.offer(st.pop());
		}
		for(int i=1;i<=(q.size()-k);i++)
		{
			q.offer(q.poll());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Queue<Integer> q = new ArrayDeque<>();
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			q.offer(x);
		}
		sc.nextLine();
		int k = sc.nextInt();
        reverseFirstK(q,k);
        q.forEach(x->System.out.print(x+" "));
	}

}
// Time complexity ---> O(k)+O(k)+O(N-k) = O(N)
// Auxiliary Space ---> O(k)
