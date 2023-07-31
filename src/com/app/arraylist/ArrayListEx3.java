package com.app.arraylist;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("aa");
		arrayList.add("aa1");
		arrayList.add("aa2");
		System.out.print(arrayList);
		System.out.println();
		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("aa3");
		arrayList1.add("aa4");
		arrayList.addAll(arrayList1);
		System.out.print(arrayList1);
		System.out.println();
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("aa5");
		arrayList2.add("aa6");
		arrayList2.add("aa7");
		arrayList.addAll(arrayList2);
		System.out.println(arrayList2);
		System.out.println();
		System.out.println(arrayList);
		
		arrayList.remove("aa1");
		arrayList.remove(0);
		System.out.println(arrayList);
		arrayList.removeAll(arrayList1);
		System.out.println(arrayList);
		arrayList.clear();
		System.out.println(arrayList);
	}
}
