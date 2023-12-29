package org.vaibhao;

/*28) Write a program in Java to print the multiplication table of 5 using for loop */


class Table{
    void printtable(int number){
        System.out.println("multiplication is = " +number);
        for(int i=1;i<=10;i++){
            System.out.println(+(number*i));
        }
    }
}
public class Multiplication {
    public static void main(String[] args) {
        Table t = new Table();
        t.printtable(5);
    }
}