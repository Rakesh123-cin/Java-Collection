package com.rakesh.PriorityQueue;

import java.util.Arrays;

public class PurchaseMaxItems {
	
	public static int maxItems(int[] costs, int sum)
	{
		Arrays.sort(costs);
		int cnt =0;
		int remainingSum=sum;
		for(int i=0;i<costs.length;i++)
		{
			if(costs[i]>remainingSum)
				break;
			cnt++;
			remainingSum -= costs[i];
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] costs = {20,10,5,30,100};
		int sum =35;
		
		System.out.println("Maximum items that can be purchased : "+maxItems(costs,sum));
	}

}

// Time complexity ----> O(n*logn) + O(n)
// Auxiliary Space ----> O(1)
