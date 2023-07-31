package com.app.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<Student> studentList = new LinkedList<>();
		studentList.add(new Student(1, "aa", 11));
		studentList.add(new Student(11, "aa1", 12));
		studentList.add(new Student(12, "aa3", 13));
		studentList.add(new Student(13, "aa4", 14));
		studentList.add(new Student(14, "aa5", 15));
		studentList.add(new Student(15, "aa6", 16));
		studentList.add(new Student(16, "aa7", 17));

		Iterator<Student> itr = studentList.iterator();

		while (itr.hasNext()) {
			Student student = itr.next();
			System.out.println(student.toString());
		}
	}
}
