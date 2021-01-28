package com.company.practice;

public class StaticMain {
    static int a;
    static int b;

    static {
        a = 86;
        b = 2*a;
        System.out.println("Static Block");
    }
    public static void main(String [] args){
        System.out.println("Main Method");
        StaticMain s = new StaticMain();
        System.out.println("a= "+a+" b= "+b);
    }
}
