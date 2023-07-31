package com.app.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student {
	private int id;
	private String name;
	private float price;

	public Student(int id, String name, float price) {
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class MapEx1 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "aa1", 1000f);
		Student s2 = new Student(2, "aa2", 2000f);
		Student s3 = new Student(3, "aa3", 3000f);
		Student s4 = new Student(4, "aa4", 4000f);
		Map<Integer, Student> map = new HashMap<Integer,Student>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put(4, s4);
		
		for(Map.Entry<Integer, Student> s : map.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}
}
