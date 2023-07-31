package com.app.exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int data = 50/0;
		} catch (Exception e) {
			int data1 = 50/0;
		}
		System.out.println("rest of the code...");
	}
}
