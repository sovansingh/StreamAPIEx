package com.app.exception;
class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
		super(str);
	}
}
public class ExcetionEx14 {

	
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("This is user-defined exception.");
		} catch (UserDefinedException e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}
	}
}
