package com.company.assignment17;

import java.io.Serializable;

public class Employee implements Serializable {

    Integer empId;
    String empName;

    public Employee(Integer empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
}
