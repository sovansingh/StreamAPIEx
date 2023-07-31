package com.app.streamapi;

import java.util.ArrayList;
import java.util.List;

class People{
	private int id;
	private String name;
	private float salary;
	public People(int id, String name, float salary) {
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
public class StreamAPIEX {

	public static void main(String[] args) {
		List<People> peoplesList = new ArrayList<People>();
		peoplesList.add(new People(1,"sovan singh",1000f));
		peoplesList.add(new People(2,"lipsa mohanty",2000f));
		peoplesList.add(new People(3,"tejaswini rana",3000f));
		List<Float> salaries = new ArrayList<Float>();
		for(People people : peoplesList) {
			if(people.getSalary() < 3000f) {
//				System.out.println(people.getSalary());
				salaries.add(people.getSalary());
			}
		}
		
		for(float f: salaries) {
			System.out.println(f);
		}
	}
}
