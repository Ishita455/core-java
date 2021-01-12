package com.company.corejava.finaldemo;

public class Shape {            // if a class is made final we cannot have a child class of the final parent
    public void display(){        //the method is declared as final it cannot be override in child class
        System.out.println("This is Shape class");
    }
}
