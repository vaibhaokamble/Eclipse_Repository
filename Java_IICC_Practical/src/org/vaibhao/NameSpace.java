package org.vaibhao;

/* 10) Write a program in Java to demonstrate namespace collision.  */


class Box3{
    double width;
    double height;
    double length;

    Box3(double width,double height,double length){
        width=width;
        height=height;
        length=length;
    }
    double getVolume(){
        return width * height * length;
    }
}
public class NameSpace {
    public static void main(String[] args) {
        Box3 b3 = new Box3(30, 20, 10);
        System.out.println("the volume of boxes = " +b3.getVolume());
        b3.getVolume();
    }
}