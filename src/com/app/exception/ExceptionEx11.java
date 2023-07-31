package com.app.exception;

public class ExceptionEx11 {

	public static void validate(int age) {
		if(age < 18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}else {
			System.out.println("Person is eligile to vote");
		}
	}
	public static void main(String[] args) {
		validate(12);
		System.out.println("Rest of the code...");
	}
}
