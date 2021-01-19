package com.company.corejava.exceptiondemo;

public class ExceptionMainTwo {

    public static void main(String[] args){

        int result = divide(10,0);
        System.out.println(result);
        result = divide(10,5);
        System.out.println(result);

    }

    public static int divide(int num1, int num2){
        int r = 0;
        try{
            r = num1/num2;      //The code which can throw exception should be written inside the try block
        }
        catch (Exception e){        //there can be 1 or more catch block to handle thrown exception
            System.out.println("num2 cannot be zero");
        }
        System.out.println("Hello");
        return r;

    }
}
