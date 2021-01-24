package com.company.assignmentday12;

public class StaticPolymorphismDemo1 {
    public void VolumeCalculation(int a){
        System.out.println("cube: "+a*a*a);
    }
    public void VolumeCalculation(int l,int b,int h){
        System.out.println("Cuboid: "+l*b*h);
    }

}
