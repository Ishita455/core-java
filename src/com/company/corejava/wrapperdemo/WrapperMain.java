package com.company.corejava.wrapperdemo;

public class WrapperMain {

            //Examples of wrapper classes
    Integer num = 10;
    Integer num2 = new Integer(12345);
    Double salary = 23454.34;
    Float a = 2345.3f;
    Long ln = 235672l;
    Character c = 'A';

    public  static  void main(String[] args){
        String roll = "1234";
        Integer r = Integer.parseInt(roll);
        Double d = Double.parseDouble(roll);
        System.out.println(r);
        System.out.println(d);

        int x = 55;
        Integer y = x;      //Autoboxing

        System.out.println(x);
        System.out.println(y);


        Double d1 = 28.79;
        double z = d1;       //Unboxing

        System.out.println(d1);
        System.out.println(z);

    }



}
