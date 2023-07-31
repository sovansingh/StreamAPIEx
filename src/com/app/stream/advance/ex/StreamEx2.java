package com.app.stream.advance.ex;

import java.util.Arrays;
import java.util.List;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,23,54,65,98,74,562,3,11,4,5,8,4,5,1,61,84,51,5,1);
		int i = list.stream().max(Integer::compare).get();
		System.out.println(i);
	}
}
