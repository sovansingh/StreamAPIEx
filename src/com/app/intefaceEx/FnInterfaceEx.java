package com.app.intefaceEx;

@FunctionalInterface
interface animal{
	void bark();
}
public class FnInterfaceEx implements animal{

	public static void main(String[] args) {
		FnInterfaceEx ex = new FnInterfaceEx();
		ex.bark();
	}

	@Override
	public void bark() {
		System.out.println("Barking...");
	}
}
