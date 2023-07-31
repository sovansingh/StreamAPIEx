package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product2{
	private int id;
	private String name;
	private float price;
	public Product2(int id, String name, float price) {
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
public class JavaStreamEx3 {

	public static void main(String[] args) {
		List<Product2> product2List = new ArrayList<Product2>();
		product2List.add(new Product2(1, "aa", 1000f));
		product2List.add(new Product2(2, "aa1", 2000f));
		product2List.add(new Product2(3, "aa2", 3000f));
		product2List.add(new Product2(4, "aa3", 4000f));
		product2List.add(new Product2(5, "aa4", 5000f));
		product2List.add(new Product2(6, "aa5", 6000f));
		product2List.add(new Product2(7, "aa6", 7000f));
		product2List.add(new Product2(8, "aa7", 8000f));
		product2List.add(new Product2(9, "aa8", 9000f));
		
		double totalPrice = product2List.stream().collect(Collectors.summingDouble(product -> product.getPrice()));
		System.out.println(totalPrice);
	}
}
