package com.app.multithread;

import java.util.Iterator;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		for(int i =0;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.print(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		t1.start();
		t2.start();
	}
}
