package org.vaibhao;

/* 21) Write a program in Java to overload method volume() to find volume of sphere and volume of rectangle. */


class Sphere{
    double volume(double r){
        double volume = (4/3.0)*(22/7.0)*r*r*r;
        return volume;
    }
}

class Rectangle11{
    double volume(double length,double width,double height){
    double volume =(length * width * height);
    return volume;
    }
}
public class OverloadMethod {
    public static void main(String[] args) {
      Sphere s = new Sphere();
      System.out.println("volume of sphere = " +s.volume(6));

      Rectangle11 r = new Rectangle11();
      System.out.println("volume of rectangle = " +r.volume(4, 7, 9));
    }
}