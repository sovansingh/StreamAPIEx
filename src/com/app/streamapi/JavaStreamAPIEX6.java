package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product5{
	private int id;
	private String name;
	private float price;
	public Product5(int id, String name, float price) {
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
public class JavaStreamAPIEX6 {

	public static void main(String[] args) {
		List<Product5> product5List = new ArrayList<Product5>();
		product5List.add(new Product5(1, "aa", 1000f));
		product5List.add(new Product5(2, "aa1", 2000f));
		product5List.add(new Product5(3, "aa2", 3000f));
		product5List.add(new Product5(4, "aa3", 4000f));
		product5List.add(new Product5(5, "aa4", 5000f));
		product5List.add(new Product5(6, "aa5", 6000f));
		product5List.add(new Product5(7, "aa6", 7000f));
		product5List.add(new Product5(8, "aa7", 8000f));
		product5List.add(new Product5(9, "aa8", 9000f));
		product5List.add(new Product5(10, "aa9", 10000f));
		
		long count = product5List.stream().filter(product -> product.getPrice() > 3000).count();
		System.out.println(count);
	}
}
