package com.app.exception;

import java.io.IOException;

class M1{
	void method()throws IOException{
		System.out.println("Device operation performed");
	}
}
public class ExceptionEx17 {

	public static void main(String[] args)throws IOException {
		M1 m = new M1();
		m.method();
		System.out.println("Normal flow");
	}
}
