package com.rakesh.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
	
	public static List<Integer> getCommonElements(int[]arr1, int[]arr2)
	{
		List<Integer> list = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int ptr=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=ptr;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					list.add(arr1[i]);
					ptr=j+1;
					break;
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] arr1 = {7, 6 ,8};
		int[] arr2 = {8,7};
		
		List<Integer> sortedList = getCommonElements(arr1,arr2);
		for(int x : sortedList)
		{
			System.out.print(x+" ");
		}
	}

}

// Time Complexity ----> O(nlogn) + O(mlogm) + O(n*m)
// Auxiliary space ----> O(1)
