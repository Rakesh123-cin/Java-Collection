package com.rakesh.StreamApi;

import java.util.Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] arr = {34,42,67,80};
		double avg = Arrays.stream(arr)
						   .average()
						   .getAsDouble();
		System.out.println(avg);
	}

}
