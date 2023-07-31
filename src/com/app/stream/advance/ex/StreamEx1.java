package com.app.stream.advance.ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,23,54,65,98,74,562,3,11,4,5,8,4,5,1,61,84,51,5,1);
		Set<Integer> set = new HashSet<>();
		
//		list.stream().filter(p -> !set.add(p)).forEach(System.out::println);
		
//		list.stream().findFirst().ifPresent(System.out::println);
		
		Long long1 = list.stream().count();
		System.err.println(long1);
	}
}
