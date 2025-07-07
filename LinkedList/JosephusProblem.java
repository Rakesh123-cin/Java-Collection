package com.rakesh.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class JosephusProblem {
	public static int lastManStanding(int N, int K)
	{
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<N;i++)
		{
			list.add(i);
		}
		int startIdx=0;
		while(list.size()>1)
		{
			int removalIdx = (startIdx+K-1)%list.size();
			list.remove(removalIdx);
			startIdx=removalIdx;		
		}
		return list.get(0);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int idx = lastManStanding(N,K);
		System.out.println(idx);
	}

}
