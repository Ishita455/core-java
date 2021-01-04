package com.company.corejava;

public class EmployeeMain {
    public static void main(String[] args){
        Employee e1 = new Employee();
        System.out.println("Employee Id: " +e1.employeeId+", " +"Employee name:" + e1.employeeName);
        System.out.println("**********************Employee 1 Details*********************************");
        e1.setEmployeeId(11233);
        e1.setEmployeeName("Raj");
        System.out.println("Employee Id: " +e1.getEmployeeId()+", " +"Employee name:" + e1.getEmployeeName());

        Employee e2 = new Employee();
        System.out.println("**********************Employee 2 Details*********************************");
        e2.setEmployeeId(234234);
        e2.setEmployeeName("Neha");
        System.out.println("Employee Id: " +e2.getEmployeeId()+", " +"Employee name:" + e2.getEmployeeName());

        Employee e3 = new Employee();
        System.out.println("**********************Employee 3 Details*********************************");
        e3.setEmployeeId(23456);
        e3.setEmployeeName("Rohan");
        System.out.println("Employee Id: " +e3.getEmployeeId()+", " +"Employee name:" + e3.getEmployeeName());

    }

}
