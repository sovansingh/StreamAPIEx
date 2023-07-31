package com.app.exception;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			try {
				try {
					int[] arr = {1,3,6,5,4,8};
					System.out.println(arr[10]);
					
				} catch (ArithmeticException e) {
					System.out.println(e);
					System.out.println("inner try block2");
				}
			} catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println("inner try block1");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("outer main block");
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("handle by main try-catch block");
		}
	}
}
