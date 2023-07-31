package com.app.exception;

public class ExcpetionEx8 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Going to divid by Zero");
				int b = 30/0;
				System.out.println(b);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				int[] arr = new int[5];
				System.out.println(arr[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Other Statement");
		} catch (Exception e) {
			System.out.println("handled the exception (outer space)");
		}
		System.out.println("normal flow");
	}
}
