package com.company.practice;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        try {
            int array1[] = new int[4];
            System.out.println("access" + array1[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is 4 ");
        }
        System.out.println("hi, out of block");
    }

}
