package com.netflix.clone;

public class Polymorphism {

    public void add(int a,int b){
        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        System.out.println(a+b+c);
        System.out.println("I actually implemented compile time polymorphism and it addded 3 numbers now");
    }
}
