package com.company.corejava;

public class StringDemo2 {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String ("Hello");
        String s4 = new String ("Hello");
        if(s1==s2){
            System.out.println("s1==s2");
        }
         if(s2==s3){
            System.out.println("s2==s3");
        }
        else {
            System.out.println("Not Equal s2==s3");
        }
        if(s3.equals(s4)){
            System.out.println("s3==s4");
        }
        else {
            System.out.println("Not Equal s3==s4");
        }
    }
}
