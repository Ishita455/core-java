package com.company.corejava.exceptiondemo;

import java.util.Locale;

public class ExceptionMainOne {
    public static void main(String[] args){
        int r = 5/0;        //This is an Example of Runtime Exception- Arthematic Exception

        String s = null;

        System.out.println(s.toLowerCase(Locale.ROOT));     //Runtime exception & type is NullPointer Exception
        System.out.println("Hello! ");

    }
}
