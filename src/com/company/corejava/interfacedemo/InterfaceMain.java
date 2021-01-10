package com.company.corejava.interfacedemo;

public class InterfaceMain {
    public static void main(String[] args){

        Bike b = new Bike();
        //b.vehicleDetail();

        Car c = new Car();
        //c.vehicleDetail();

            //Output is going to depend on whose object is going to be created

        Vehicle v = new Bike();             // Bike object is being created & vehicle reference is pointing to Bike

        //This concept is dynamic polymorphism
        v.vehicleDetail();

        v = new Car();
        v.vehicleDetail();
    }
}
