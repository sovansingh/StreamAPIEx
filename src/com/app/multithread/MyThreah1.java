package com.app.multithread;

public class MyThreah1 {

	public static void main(String[] args) {
		Runnable r1 = new MultiRunnable();
		
		Thread th1 = new Thread(r1,"My new Thread");
		
		th1.start();
		
		String name = th1.getName();
		System.out.println(name);
	}
	
}
