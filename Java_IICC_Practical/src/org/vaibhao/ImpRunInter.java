package org.vaibhao;

/* 19) Write a program in Java to create child thread by implementing runnable interface */

class MyNewthread implements Runnable {
	public void run() {
		int i = 0;
		while (i <= 4) {
			System.out.println("child thread " + i);
			i++;
		}
	}
}

public class ImpRunInter {
	public static void main(String[] args) {
		MyNewthread n = new MyNewthread();
		Thread t = new Thread(n);
		t.start();
		int j = 0;
		while (j <= 4) {
			System.out.println("main thread" + j);
			j++;
		}
		System.out.println("main thread exist");
	}
}