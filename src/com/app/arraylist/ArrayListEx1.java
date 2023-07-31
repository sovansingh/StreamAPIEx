package com.app.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("sovan");
		arrayList.add("sovan singh");
		arrayList.add("sovan bicky");
		arrayList.add("sovan nitesh");
		arrayList.add("sovan lipsa");
		arrayList.add("sovan tejaswini");
		arrayList.add("sovan sanghamitra");
		
		System.out.println("Traversing list through List iterator");
		ListIterator<String> itr = arrayList.listIterator(arrayList.size());
		while(itr.hasPrevious()) {
			String str = itr.previous();
			System.out.println(str);
		}
		System.out.println("Traversing list through for loop");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Traversing list through forEach()");
		arrayList.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Traversing list through  iterator");
		Iterator<String> itr1 = arrayList.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
