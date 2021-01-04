package com.company.corejava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a,b;
        int choice=4;
        a=5;
        b=8;
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        System.out.println("Your enter choice is "+ choice);
        if(choice==1){
            System.out.println("Addition is "+a+b);
        }
        else if(choice==2){
            System.out.println("Subtraction is " + (a-b));
        }
        else if(choice==3){
            System.out.println("Multiplication is " + a*b);
        }
        else if(choice==4){
            System.out.println("Division is " + a/b);
        }
        else{
            System.out.println("wrong option");
        }
    }
}
