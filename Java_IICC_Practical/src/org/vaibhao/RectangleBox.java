package org.vaibhao;

/* 7) Write a Java program to create classes Rectangle and Box and find out 
their names by using methods. */


class Rectangle1{
	double length;
	double width;
	double height;
	double area;
	public Rectangle1() {
		length = 5;
		width = 7;
		height = 8;
	}
	
	void setRectangle() {
		area = length * width * height;
	}
	
	void showRectangle() {
		System.out.println("area of rectangle = " +area);
	}
}

class Box{
	double length;
	double width;
	double height;
	double volume;
	
	public Box() {
		length=15;
		width=16;
		height=17;
	}
	void setBox() {
		volume = length * width * height;
	}
	void showBox() {
		System.out.println("the volume of box = " +volume);
	}
}

public class RectangleBox {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.setRectangle();
		r.showRectangle();
		Box box = new Box();
		box.setBox();
		box.showBox();
		
    }
}