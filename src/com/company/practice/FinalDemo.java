package com.company.practice;

public class FinalDemo {

    public /*final*/ void display(){
        System.out.println("This is final method");
    }
}

 class FinalDemo1 extends FinalDemo{
    public final void display(){
        System.out.println("The final method overridden");
    }
}
