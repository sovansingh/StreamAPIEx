package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPIEx9 {

	public static void main(String[] args) {
		List<Product7> product6List = new ArrayList<Product7>();
		product6List.add(new Product7(1, "aa", 1000f));
		product6List.add(new Product7(2, "aa1", 2000f));
		product6List.add(new Product7(3, "aa2", 3000f));
		product6List.add(new Product7(4, "aa3", 4000f));
		product6List.add(new Product7(5, "aa4", 5000f));
		product6List.add(new Product7(6, "aa5", 6000f));
		product6List.add(new Product7(7, "aa6", 7000f));
		product6List.add(new Product7(8, "aa7", 8000f));
		product6List.add(new Product7(9, "aa8", 9000f));
		
		List<Float> salaries = product6List.stream().filter(product -> product.getPrice() > 3000f).map(Product7::getPrice).collect(Collectors.toList());
		System.out.println(salaries);
	}
	
}
