package com.app.stream.advance.ex;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,504,5,55,669,8,447,5,4);
//		list.stream().filter(p -> p%2 == 0).forEach(System.out::println);
		
		list.stream().map(p -> p+"").filter(p -> p.startsWith("1")).forEach(System.out::println);
	}
}
