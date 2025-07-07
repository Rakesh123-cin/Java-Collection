package com.rakesh.StreamApi;

import java.util.Arrays;

public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = {12,43,23,67,41};
		int max = Arrays.stream(arr)
				         .max()
				         .getAsInt();
		System.out.println(max);
	}

}
