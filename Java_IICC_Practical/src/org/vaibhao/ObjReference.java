package org.vaibhao;

/* 5) Write a Java program to assign the object reference variable. */



class Demo {
    int x = 10;
 
    int display()
    {
        System.out.println("x = " + x);
        return 0;
    }
}
public class ObjReference {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.x);
        d1.display();
    }
}