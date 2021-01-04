package com.company.corejava.interfacedemo;

public class Bike implements Vehicle {
                //In method overriding all the details of the function should be exact same like same name, argument list, return type
    @Override
    public void vehicleDetail() {
        System.out.println("This is a Bike");
    }

}
