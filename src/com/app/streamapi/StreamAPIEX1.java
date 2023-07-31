package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class People2{
	private int id;
	private String name;
	private float salary;
	public People2(int id, String name, float salary) {
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
public class StreamAPIEX1 {

	public static void main(String[] args) {
		List<People2> peoplesList = new ArrayList<People2>();
		peoplesList.add(new People2(1, "aa", 1000f));
		peoplesList.add(new People2(2, "aa1", 2000f));
		peoplesList.add(new People2(3, "aa2", 3000f));
		peoplesList.add(new People2(4, "aa3", 4000f));
		peoplesList.add(new People2(5, "aa4", 5000f));
		peoplesList.add(new People2(6, "aa5", 6000f));
		peoplesList.add(new People2(7, "aa6", 7000f));
		
		List<Float> salaries = peoplesList.stream().filter(s -> s.getSalary() > 2000f).map(s -> s.getSalary()).collect(Collectors.toList());
		
		for(float f: salaries) {
			System.out.println(f);
		}
	}
}
