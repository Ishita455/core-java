package com.company;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args){
        int employees[] = new int[5];
       // boolean employees[] = new boolean[5];
      //  String employees[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<employees.length; i++){
            System.out.println("Enter Employess values " +(i+1));
            employees[i] = scanner.nextInt();
            System.out.println(employees[i]);
        }

    }
}
