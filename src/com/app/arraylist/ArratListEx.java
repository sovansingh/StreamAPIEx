package com.app.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArratListEx {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aa");
		arrayList.add("aa1");
		arrayList.add("aa2");
		arrayList.add("aa3");
		arrayList.add("aa4");
		arrayList.add("aa5");
		arrayList.add("aa6");
//		System.out.println(arrayList);
		
//		Iterator<String> itr = arrayList.iterator();
//		
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		for(String str : arrayList) {
//			System.out.println(str);
//		}
		
//		System.out.println(arrayList.get(1));
//		arrayList.set(1, "sovan snigh");
//		
//		for(String str : arrayList) {
//			System.out.println(str);
//		}
		
		Collections.sort(arrayList);
		for(String str : arrayList) {
			System.out.println(str);
		}
		
		ArrayList<Integer> i =new ArrayList<>();
		i.add(291);
		i.add(2811);
		i.add(2712);
		i.add(2613);
		i.add(2614);
		i.add(2515);
		i.add(2316);
		
		Collections.sort(i);
		for(Integer i1 : i) {
			System.out.println(i1);
		}
	}
}
