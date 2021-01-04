package com.company.corejava;

import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
        int a, b, c = 0;
        System.out.println("Enter the two numbers");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Unswap nos "+a+ " " +b);
        c = b;
        b = a;
        a = c;
        System.out.println("Swapping Numbers "+a+ " " +b);
    }
}
