package com.app.linkedlist;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("aa");
		linkedList.add("aa1");
		linkedList.add("aa2");
		System.out.print(linkedList);
		System.out.println();
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("aa3");
		linkedList2.add("aa4");
		linkedList.addAll(linkedList2);
		System.out.print(linkedList2);
		System.out.println();
		
		LinkedList<String> linkedList3 = new LinkedList<>();
		linkedList3.add("aa5");
		linkedList3.add("aa6");
		linkedList3.add("aa7");
		linkedList.addAll(linkedList3);
		System.out.println(linkedList3);
		System.out.println(linkedList);
		linkedList.addFirst("sovan");
		linkedList.addLast("lipsa");
		System.out.println(linkedList);
		linkedList.remove(1);
		linkedList.remove("aa7");
		System.out.println(linkedList);
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.removeFirstOccurrence("aa1");
		linkedList.removeLastOccurrence("aa6");
		System.out.println(linkedList);
		linkedList.clear();
		System.out.println(linkedList);

	}
}
