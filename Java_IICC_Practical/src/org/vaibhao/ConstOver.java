package org.vaibhao;

/* 13) Write a program in Java to compute volume of box and cube by using constructor overloading */

class Volume {
	double area;
	double height;
	double width;
	double length;

	void findVolumeCube(double area) {
		System.out.println("the volume of cube = " + (area * area * area));
	}

	void findVolumeBox(double height, double width, double length) {
		System.out.println("the volume of box is = " + (height * width * length));
	}
}

public class ConstOver {
	public static void main(String[] args) {
		Volume v = new Volume();
		v.findVolumeCube(5);
		v.findVolumeBox(6, 7, 3);
	}
}