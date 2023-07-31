package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product7{
	private int id;
	private String name;
	private float price;
	public Product7(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
public class JavaStreamAPIEX8 {

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
		
		Map<Integer, String> productMapList =  product6List.stream().collect(Collectors.toMap(product -> product.getId(), product -> product.getName()));
		System.out.println(productMapList);
	}
}
