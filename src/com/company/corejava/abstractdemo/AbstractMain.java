package com.company.corejava.abstractdemo;

public class AbstractMain {
    public static  void  main(String[] args){

        JointFamily j = new JointFamily();
        j.familyType();
        j.addressDetails();

        Family f = new JointFamily();       //Dynamic poly.
        f.addressDetails();
        f.familyType();

    }
}
