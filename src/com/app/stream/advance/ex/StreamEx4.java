package com.app.stream.advance.ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx4 {

	public boolean containsDuplicate(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		if(set.size() == list.size()) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr = {10,23,54,65,98,74,562,3,11,4,5,8,4,5,1,61,84,51,5,1};
		StreamEx4 streamEx4 = new StreamEx4();
		boolean b = streamEx4.containsDuplicate(arr);
		System.out.println(b);
	}
}
