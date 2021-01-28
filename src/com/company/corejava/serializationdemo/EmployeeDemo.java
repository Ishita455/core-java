package com.company.corejava.serializationdemo;


public class EmployeeDemo implements java.io.Serializable {

    Float empId;
    String empName;
    String department;

    public EmployeeDemo(Float empId, String empName, String department){

        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }
}
