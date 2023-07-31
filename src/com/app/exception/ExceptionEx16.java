package com.app.exception;

import java.io.IOException;
class M{
	void method()throws IOException{
		throw new IOException("Device error");
	}
}
public class ExceptionEx16 {

	public static void main(String[] args) {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("Normal flow");
	}
}
