package com.netflix.clone;

public abstract class Abstraction {

    abstract void add(int a,int b);



}

public class impl extends Abstraction{
    @Override
    public void add(int a,int b){
        System.out.println(a*b);
        System.out.println("Surprize i am abstract class i actually multiplied");
    }
}
