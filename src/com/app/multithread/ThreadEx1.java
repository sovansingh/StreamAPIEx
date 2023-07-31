package com.app.multithread;

public class ThreadEx1 {

	public static void main(String[] args) {
		MultiRunnable multiRunnable = new MultiRunnable();
		Thread thread = new Thread(multiRunnable);
		thread.start();
	}
}
