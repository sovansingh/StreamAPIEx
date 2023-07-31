package com.app.multithread;

public class MyThread2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
