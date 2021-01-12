package com.company.corejava.staticdemo;

public class StaticMain {

    public StaticMain(){
      System.out.println("This is a Default Constructor");
    }

    static
    {
        System.out.println("Im static Block 1");

    }
    {
        System.out.println("Non Static Block 2");
    }
    {
        System.out.println("Non Static Block 1");
    }
    static
    {
        System.out.println("Im static Block 2");

    }



    public static void main(String[] args){

        {
            System.out.println("Im non static Block 3");

        }
        StaticMain sm = new StaticMain();
        {
            System.out.println("Im non static Block 4");

        }
    }
}
