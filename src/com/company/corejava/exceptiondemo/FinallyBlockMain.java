package com.company.corejava.exceptiondemo;

public class FinallyBlockMain {
    public static void main(String[] args){
        try{
            int data = 25/5;
            String s = null;
            System.out.println(data);
            System.out.println(s.length());
            System.out.println("Hello");
        }

        /*catch (NullPointerException e) {
            System.out.println(e);
        }*/
        finally {                                                  //try with finally is allowed
            System.out.println("Finally Block is executed");
        }
        System.out.println("Rest of the Code...");
    }
}
//there can be 1 try & (0-many) catch block and 1 finally
//Finally block gets executed always only exception is System.exit();