package com.app.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionEx5 {

	public static void main(String[] args) {
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter("sovan.txt");
			printWriter.print("saved");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}
