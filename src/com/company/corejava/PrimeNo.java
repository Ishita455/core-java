package com.company.corejava;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int no, p = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        no = scanner.nextInt();
        for (int i = 1; i <= no; i++) {
            if (no % i == 0)
                p += 1;
        }
        if (p == 2) {
            System.out.println("The number is a prime number " + no);
        } else {
            System.out.println("Its a composite number");
        }
    }
}