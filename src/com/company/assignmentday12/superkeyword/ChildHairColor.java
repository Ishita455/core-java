package com.company.assignmentday12.superkeyword;

public class ChildHairColor extends ParentHairColor {
   public String getHairColor(){
       return "Blonde";
   }

   public void printHairColor(){
       System.out.println("Parent Hair Color: " +super.getHairColor());
       System.out.println("Child hair Color: " +getHairColor());
   }
}
