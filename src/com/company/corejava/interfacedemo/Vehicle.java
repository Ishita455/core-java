package com.company.corejava.interfacedemo;

public interface Vehicle {
     int b=0;         //Any variable in the interface automatically becomes public , static and final
    //vehicleDetail() is an abstract method coz it dosnt have any body only has declaration
    public void vehicleDetail();        //In Interface only funt declaration allowed but not defination
    //for defination create another class which will impliment the vehicle interface and then give defination of vehicleDetails funt in that class


}
