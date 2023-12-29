package org.vaibhao;

/* 23) Write a program in Java to demonstrate the concept of multilevel inheritance.
 */


class hostel{
    public void area(){
        System.out.println("i am hostellers");
    }
}

class Student extends hostel{
    public void person(){
        System.out.println("i am student");
    }
}

class Deparatment extends Student{
    public void display(){
        System.out.println("this is university");
    }
}
public class MultiLvelInh {
    public static void main(String[] args) {
        Deparatment d = new Deparatment();
        d.display();
        d.area();
        d.person();
    }
}