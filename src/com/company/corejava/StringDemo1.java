package com.company.corejava;

public class StringDemo1 {
    public static void main(String[] args){
        String firstName = "Ishita";
        String lastName = "Rathod";

        System.out.println(firstName+"\t" +lastName);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName+"\\"+lastName);
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.length());
        System.out.println(firstName.substring(2));  //prints from i to the string length
        System.out.println(firstName.substring(2,5));  //prints from i to j-1
        System.out.println(firstName.concat(lastName));  //
    }
}
