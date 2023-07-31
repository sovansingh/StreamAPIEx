package com.app.stream.advance.ex;

import java.util.Arrays;
import java.util.List;

public class StreamEx5 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5,4,5,8,5,26,6,6,5,45,9216,2,84,1,61,51,5,1);
		
		list.stream().map(m -> m*m*m).filter(p -> p>50).forEach(System.out::println);
	}
}
