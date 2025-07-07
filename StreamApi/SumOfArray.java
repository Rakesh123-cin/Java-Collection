package com.rakesh.StreamApi;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {12,45,31,56};
		int sum = Arrays.stream(arr)
				         .sum();
		
		System.out.println(sum);
	}

}
