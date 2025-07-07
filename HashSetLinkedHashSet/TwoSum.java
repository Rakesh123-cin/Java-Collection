package com.rakesh.HashSetLinkedHashSet;
class Pair
{
	int a;
	int b;
	
	Pair(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Pair [a=" + a + ", b=" + b + "]";
	}
	
	
}
public class TwoSum {
	
	public static Pair twoSum(int[] arr, int sum)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
					return new Pair(arr[i],arr[j]);
			}
		}
		return new Pair(-1,-1);
	}
	public static void main(String[] args) {
		int arr[] = {3, 2, 8, 15, -8};
		int sum = 10;
		
		System.out.println(twoSum(arr,sum));
	}

}

// Time Complexity ------> O(n*n)
// Auxiliary Space -----> O(1)
