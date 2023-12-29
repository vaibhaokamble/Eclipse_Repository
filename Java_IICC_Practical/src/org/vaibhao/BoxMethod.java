package org.vaibhao;

/* 8) Write a Java program to find the volume of box using method.(create 
method volume())  */

class Box1 {
	double length;
	double width;
	double height;
	double volume;

	public Box1() {
		length = 10;
		width = 20;
		height = 30;
	}

	void setBox() {
		volume = length * width * height;
	}

	void showVolume() {
		System.out.println("the volume of box = " + volume);
	}
}

class BoxMethod {
	public static void main(String[] args) {
		Box1 box = new Box1();
		box.setBox();
		box.showVolume();
	}
}