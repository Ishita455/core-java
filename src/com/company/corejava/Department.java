package com.company.corejava;

import com.company.Student;

public class Department {
    int deptId;
    String deptName;
    String hOD;
    Student student;

    //Default Constructor
    //Constructors r used for intializing the members variables value right at the object creation time
    public Department(){        //Constructor is a special function with name same as class name, it can have return type but we donot mention it explicitly
      System.out.println("This is the Department class");
        System.out.println("Department ID: "+deptId+" Department Name: "+deptName+" Department HOD: "+hOD);
        System.out.println("Student Details: "+student);
    }
    public Department(int deptId,String deptName,String hOD){   //This is 3 parameter overloaded contr
        System.out.println("Department ID: "+deptId+" Department Name: "+deptName+" Department HOD: "+hOD);

        this.deptId = deptId;           //Assigning the local function variable deptId value to the object deptId variable with the help of this keyword
        this.deptName = deptName;       //Assigning the local function variable deptName value to the object deptName variable with the help of this keyword
        this.hOD = hOD;                 //Assigning the local function variable hOD value to the object hOD variable with the help of this keyword

        System.out.println("Members Variable  " +this.deptId+" "+this.deptName+" "+this.hOD);
        System.out.println(student);      //the value of the student will null as default value

    }

}
