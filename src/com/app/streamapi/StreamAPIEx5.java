package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product4{
	private int id;
	private String name;
	private float price;
	public Product4(int id, String name, float price) {
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
public class StreamAPIEx5 {

	public static void main(String[] args) {
		List<Product4> productList = new ArrayList<Product4>();
		productList.add(new Product4(1, "aa", 1000f));
		productList.add(new Product4(2, "aa1", 2000f));
		productList.add(new Product4(3, "aa2", 3000f));
		productList.add(new Product4(4, "aa3", 4000f));
		productList.add(new Product4(5, "aa4", 5000f));
		productList.add(new Product4(6, "aa5", 6000f));
		productList.add(new Product4(7, "aa6", 7000f));
	
		Product4 productA = productList.stream().min((product1,product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
		System.out.println(productA.getPrice());
		
		Product4 productB = productList.stream().max((product1,product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();
		
		System.out.println(productB.getPrice());
	}
}
