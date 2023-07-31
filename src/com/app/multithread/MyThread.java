package com.app.multithread;

public class MyThread {

	public static void main(String[] args) {
		Thread thread = new Thread("My First Thread...");
		thread.start();
		
		String str = thread.getName();
		System.out.println(str);
	}
}
