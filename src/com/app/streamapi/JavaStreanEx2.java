package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product1{
	private int id;
	private String name;
	private float price;
	public Product1(int id, String name, float price) {
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
public class JavaStreanEx2 {

	public static void main(String[] args) {
		List<Product1> productsList = new ArrayList<Product1>();
		productsList.add(new Product1(1, "aa", 1000f));
		productsList.add(new Product1(2, "bb", 2000f));
		productsList.add(new Product1(3, "cc", 3000f));
		productsList.add(new Product1(4, "dd", 4000f));
		productsList.add(new Product1(5, "ee", 5000f));
		
		Float totalPrice = productsList.stream().map(product -> product.getPrice()).reduce(0.0f,(price,sum)->price+sum);
		System.out.println(totalPrice);
		
		Float totalPrice1 = productsList.stream().map(product -> product.getPrice()).reduce(0.0f, Float::sum);
		System.out.println(totalPrice1);
	}
}
