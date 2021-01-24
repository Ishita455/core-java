package com.company.practice;

public class WrapperPratice {

    public static void main(String[] args){

        char ch = 'a';
        Character c = ch;       //autoboxing

        Integer x = 345;        //unboxing
        int y = x;

        String s = "34567";
        Integer r = Integer.parseInt(s);
        System.out.println(r);

    }
}
