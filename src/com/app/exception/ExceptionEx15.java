package com.app.exception;

import java.io.IOException;

public class ExceptionEx15 {

	void m() throws IOException{
//		int data = 50/0;
		throw new IOException("device error");
	}
	void n() throws IOException{
		m();
	}
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) {
		ExceptionEx15 exceptionEx15 = new ExceptionEx15();
		exceptionEx15.p();
		System.out.println("Rest of the code...");
	}
}
