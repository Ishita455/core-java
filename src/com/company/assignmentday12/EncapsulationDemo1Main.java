package com.company.assignmentday12;

import java.util.Scanner;

public class EncapsulationDemo1Main {
    public static void main(String[] args){

        EncapsulationDemo1 ed = new EncapsulationDemo1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the User Name");
        String s = scanner.nextLine();
        ed.setUserName(s);
        System.out.println("Enter the Password");
        int p = scanner.nextInt();
        ed.setPswd(p);
        System.out.println("User Name: "+ ed.getUserName());
        System.out.println("User Password: "+ ed.getPswd());
    }


}
