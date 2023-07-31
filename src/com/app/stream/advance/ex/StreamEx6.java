package com.app.stream.advance.ex;

import java.util.Arrays;

public class StreamEx6 {

	public static void main(String[] args) {
		int arr[] = {12,54,6,5,8,5454,84,62,62,1,51,47};
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		Arrays.parallelSort(arr);
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
//		Arrays.stream(arr).forEach(System.out::println);
		Arrays.stream(arr).forEach(s -> System.out.print(s+" "));
		
	}
}
