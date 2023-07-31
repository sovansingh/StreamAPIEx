package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product{
	private int id;
	private String name;
	private float salary;
	public Product(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
public class JavaStreanEx1 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "a", 1000f));
		productsList.add(new Product(2, "a1", 2000f));
		productsList.add(new Product(3, "a2", 3000f));
		productsList.add(new Product(4, "a3", 4000f));
		productsList.add(new Product(5, "a4", 5000f));
		productsList.add(new Product(6, "a5", 6000f));
		productsList.add(new Product(7, "a6", 7000f));
		
		productsList.stream().filter(product -> product.getSalary() > 2000f).forEach(product -> System.out.println(product.getName()));
	}
}
