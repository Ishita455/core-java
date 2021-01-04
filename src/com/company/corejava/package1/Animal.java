package com.company.corejava.package1;

public class Animal {

   //private String animalType;       //private member variables are access within the class, and cannot be access outside the class along with diff class in another package
   public String animalType;            //public member variables are access within the class, and can be accessed in any other class which is within the same package(package1) as well as diff package
   //String animalType;            //default member variables are access within the class, and can be accessed in any other class which is within the same package(package1) but not in diff package (class)

    public void printDetails(){
        System.out.println(animalType);
    }

}
