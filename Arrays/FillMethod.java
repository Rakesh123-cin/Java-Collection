package com.rakesh.Arrays;

import java.util.Arrays;

public class FillMethod {

	public static void main(String[] args) {
		int[] arr = {12,24,10,34,67};
		
		Arrays.fill(arr,2,4,5);
		System.out.println(Arrays.toString(arr));

	}

}
