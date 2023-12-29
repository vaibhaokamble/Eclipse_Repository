package org.vaibhao;



class Boys{
    void name(){
        System.out.println("we are friends");
    }

}
public class MethodOverriding extends Boys {
    public static void main(String[] args) {
        Boys b = new Boys();
        b.name();
    }
}