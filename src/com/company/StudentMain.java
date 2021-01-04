package com.company;

import java.util.Scanner;

public class StudentMain {
    public static  void main(String[] args){

        //Input for Total no of Students
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total no of students");
        int noOfStudent = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the college name");
        Student.collegeName = scanner.nextLine();
        //Create the references in stack area of RAM, each reference value will be null
        Student s[]= new Student[noOfStudent];

        //Loop for all student in array
        for(int i=0; i< s.length; i++){
            s[i] = new Student();           //s[0] reference will point to a newly created student object

            System.out.println("Enter the value of Roll no for student "+(i+1));
            int r = scanner.nextInt();
            s[i].setRollNo(r);
            scanner.nextLine();
            System.out.println("Enter the value of Name of the Student "+(i+1));
            String n = scanner.nextLine();
            s[i].setName(n);

            /*System.out.println("Enter the value for College Name "+(i+1));
            String cn = scanner.nextLine();
            s[i].setCollegeName(cn);*/

           // System.out.println("Student Rollno: "+s[i].getRollNo()+" Student Name: "+s[i].getName()+" Student College: "+s[i].getCollegeName());2

        }
        System.out.println("**************************Student Details*************************");
        //Right side of colon is the name of the array and left side datatype along with local variable of the datatype stored inside array
        for(Student st:s){
            //System.out.println("Student Rollno: "+ st.getRollNo()+" Student Name: "+ st.getName()+" Student College: "+st.getCollegeName());
            System.out.println("Student Rollno: "+ st.getRollNo()+" Student Name: "+ st.getName()+" Student College: "+Student.getCollegeName());
           // System.out.println("Student Rollno: "+ st.getRollNo()+" Student Name: "+ st.getName()+" Student College: "+Student.collegeName);
        }
    }

}
