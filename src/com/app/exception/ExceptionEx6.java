package com.app.exception;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
//			int arr[] = new int[5];
//			arr[5] = 30/0;
//			System.out.println(arr[10]);
//			System.out.println(arr[10]);
//			arr[5] = 30/0;
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Exception Occurs");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception occurs");
		}catch (Exception e) {
			System.out.println("Parent Exceptioon Occurs");
		}
		System.out.println("Rest of the code...");
	}
}
