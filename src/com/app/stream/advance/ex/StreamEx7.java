package com.app.stream.advance.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx7 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sovan", "lipsa", "Tejaswini", "Sangeeta", "Priya", "Pooja");

		List<String> newList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(newList);
		List<String> newList1 = list.stream().map(f -> f.toUpperCase()).collect(Collectors.toList());
		System.out.println(newList1);
	}
}
