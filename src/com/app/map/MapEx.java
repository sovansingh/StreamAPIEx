package com.app.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(2, "aa1");
		map.put(3, "aa2");
		map.put(4, "aa3");
		map.put(5, "aa4");

//		Set set = map.entrySet();
//		Iterator itr = set.iterator();
//	
//		while (itr.hasNext()) {
//			Map.Entry m = (Entry) itr.next();
//			System.out.println(m.getKey()+" "+m.getValue());
//		}

//		for(Map.Entry m: map.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
//		}

//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

//		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

//		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

		map.putIfAbsent(6, "knfknfk");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();

		Map<Integer, String> m = new HashMap<>();
		m.put(7, "jnfjf");

		map.putAll(m);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();

		map.remove(1);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();

		map.remove(2, "aa1");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println();

		map.replace(3, "sovan lipsa");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	
		map.replaceAll((k,v) -> "lalala...");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
}
