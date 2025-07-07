package com.rakesh.HashSetLinkedHashSet;

import java.util.HashSet;

class NewPair
{
	int a;
	int b;
	
	NewPair(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Pair [a=" + a + ", b=" + b + "]";
	}
	
	
}

public class TwoSumOptimised {
	
	public static NewPair twoSum(int[] arr, int sum)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains((sum-arr[i])))
			{
				return new NewPair(arr[i],(sum-arr[i]));
			}
			set.add(arr[i]);
		}
		return new NewPair(-1,-1);
	}
	public static void main(String[] args) {
		int arr[] = {3, 2, 8, 15, -8};
		int sum = 17;
		
		System.out.println(twoSum(arr,sum));
	}

}

// Time Complexity -----> O(n)
// Auxiliary Space -----> O(n)