package com.app.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx13 {

	public static void method()throws FileNotFoundException{
		FileReader fileReader = new FileReader("c://sovan.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Rest of the code...");
	}
}
