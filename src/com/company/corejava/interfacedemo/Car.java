package com.company.corejava.interfacedemo;

public class Car implements Vehicle {
    int x;
    @Override       //Annotation
    public void vehicleDetail() {
        System.out.println("This is a Car"+Vehicle.b);
    }
}
