package org.vaibhao;

/* 6) Write a Java program to assign the one object to another object. */

class Students {  
    int refno;  
    String refname;  
    Students(int i, String n) {  
     refno = i;  
     refname = n;  
    }  
    Students(Students s) {  
     refno = s.refno;  
     refname = s.refname;  
    }  
    void display() {  
        System.out.println(refno + " " + refname);  
       }  
    }
public class ObjAnotherRef {
    public static void main(String[] args) {
        Students s1 = new Students(17,"vaibhao");
        Students s2 = new Students(s1);
        s1.display();
        s2.display();
    }
}