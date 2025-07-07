package com.rakesh.Arrays;

import java.util.Arrays;

public class BianrySearch {

	public static void main(String[] args) {
		int[] arr = {23,28,35,40,76};
		
		System.out.println(Arrays.binarySearch(arr,35));
		
		System.out.println(Arrays.binarySearch(arr, 30));
		
		System.out.println(Arrays.binarySearch(arr, 1,5,40));
	}

}
