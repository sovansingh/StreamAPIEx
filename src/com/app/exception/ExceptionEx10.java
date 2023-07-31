package com.app.exception;

public class ExceptionEx10 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
//			int data = 25/5;
			int data = 25/0;
			System.out.println(data);
//		} catch (NullPointerException e) {
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always excuted");
		}
		System.out.println("Rest of the code...");
	}
}
