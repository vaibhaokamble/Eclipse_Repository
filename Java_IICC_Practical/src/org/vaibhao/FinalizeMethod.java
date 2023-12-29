package org.vaibhao;

/* 12) Write a program in Java to demonstrate finalize() method. */

public class FinalizeMethod {
	public static void main(String[] args) {
		FinalizeMethod f = new FinalizeMethod();
		f = null;
		System.gc();
		System.out.println("out of main method");
	}

	protected void finalize() {
		System.out.println("out if finalize method");
	}
}