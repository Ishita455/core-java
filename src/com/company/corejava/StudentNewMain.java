package com.company.corejava;

import java.util.Scanner;

public class StudentNewMain {
    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total no of students");
        int noOfStudentNew = scanner.nextInt();

        StudentNew studentNews[] = new StudentNew[noOfStudentNew];

        scanner.nextLine();
        System.out.println("Enter the college name");
        String collegeName = scanner.nextLine();

        for(int i=0; i<studentNews.length; i++){
            
           System.out.println("Enter the " +(i+1)+" Student Roll no");
             int r = scanner.nextInt();

             scanner.nextLine();
           System.out.println("Enter the" +(i+1)+" Student Name");
             String nm = scanner.nextLine();

            studentNews[i] = new StudentNew(r,nm,collegeName);
        }
        for(StudentNew st:studentNews){
            System.out.println("Student Roll no: "+st.rollNo+" Student Name: "+st.name+" Student College name : "+st.collegeName);
        }
    }
}
