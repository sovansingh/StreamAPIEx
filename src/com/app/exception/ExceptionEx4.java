package com.app.exception;

public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			int data[] = {1,3,7,4};
			System.out.println(data[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}
