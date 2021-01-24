package com.company.corejava;

public class Area {
    public double area(double r){
        return (r*3.14*r);
    }

    public  double area(double l, double b){
        return (l*b);
    }

    public String area(){
        return ("Calculating Area");
    }

    public  String area(int id, String name, double salary)
    {
        return (id+" "+name+" "+salary);
    }
}
