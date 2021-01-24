package com.company.assignmentday11;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNameMain {
    public static void main(String[] args){
        StudentName sn = new StudentName("Ishita");
        StudentName sn1 = new StudentName();

        System.out.println(sn.name);
        System.out.println(sn1.name);
    }
}
