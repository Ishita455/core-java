package com.company.corejava;

import java.util.Scanner;

public class ReversePallindrom {
    public static void main(String[] args){
            int rem,rev=0,num;
        System.out.println("Enter a three digit number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int no=num;
        while(num!=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            System.out.println(num);
        }
        if(no==rev) {
            System.out.println("Its a Pallindrome number " + rev);
        }
            else{
                System.out.println("Its not a Pallindrome number ");
            }
        }
    }

