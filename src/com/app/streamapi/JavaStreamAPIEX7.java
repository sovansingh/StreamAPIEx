package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product6{
	private int id;
	private String name;
	private float price;
	public Product6(int id, String name, float price) {
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
public class JavaStreamAPIEX7 {

	public static void main(String[] args) {
		List<Product6> product6List = new ArrayList<Product6>();
		product6List.add(new Product6(1, "aa", 1000f));
		product6List.add(new Product6(2, "aa1", 1000f));
		product6List.add(new Product6(3, "aa2", 2000f));
		product6List.add(new Product6(4, "aa3", 3000f));
		product6List.add(new Product6(5, "aa4", 3000f));
		product6List.add(new Product6(6, "aa5", 3000f));
		product6List.add(new Product6(7, "aa6", 4000f));
		product6List.add(new Product6(8, "aa7", 5000f));
		product6List.add(new Product6(9, "aa8", 6000f));
		product6List.add(new Product6(10, "aa9", 6000f));
		product6List.add(new Product6(11, "aa10", 7000f));
		product6List.add(new Product6(12, "aa11", 7000f));
	
		Set<Float> salaries = product6List.stream().filter(product -> product.getPrice() > 2000f).map(product -> product.getPrice()).collect(Collectors.toSet());
		System.out.println(salaries);
		
		Set<Float> salaries1 = product6List.stream().filter(product -> product.getPrice() > 3000f).map(product -> product.getPrice()).collect(Collectors.toSet());
		System.out.println(salaries1);
	}
}
