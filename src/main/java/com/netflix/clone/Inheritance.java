package com.netflix.clone;

public class Inheritance {


    int a = 10;
    String b = "hi";
    public void add(int a,int b){
        System.out.println(a+""+b);
        System.out.println("surprize no addition");
    }





}

class child extends Inheritance{

    @Override
    public void add(int a,int b){
        System.out.println(a+b);
        System.out.println("this is actual addition");
        super.add(5,6);
    }



    public void uparwale(){
        System.out.println(super.a);
        System.out.println(super.b);
    }

}


