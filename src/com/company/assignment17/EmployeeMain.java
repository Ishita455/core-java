package com.company.assignment17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args){

        Integer empId;
        String empName;
        Integer noOfEmp = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<>();

        System.out.println("______________Employee Details____________");
        System.out.println("0: Add no of Employees");
        System.out.println("1: Add Employees");
        System.out.println("2: Search Employee");
        System.out.println("3: Edit Employee");
        System.out.println("4: Delete Employee");
        System.out.println("5: Display Employee");
        System.out.println("6: Exit");

        System.out.println("Enter the Choice");
        int ch = sc.nextInt();

        switch (ch)
        {
            case 0:
                System.out.println("Enter the no of Employee in an Organisation");
                noOfEmp = sc.nextInt();
                sc.nextLine();
                break;
            case 1:
                System.out.println("Enter the no of Employee in an Organisation");
                noOfEmp = sc.nextInt();
                sc.nextLine();
                System.out.println("Add Employees");
                for (int i=0; i<noOfEmp; i++){

                    System.out.println("Add the Employee");
                    System.out.println("Enter The Employee ID");
                    empId = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the Employee Name");
                    empName = sc.nextLine();

                    Employee tempEmp =  new Employee(empId,empName);
                    emp.add(tempEmp);

                    boolean result = addEmployee(emp.get(i));
                    if(result) {
                        System.out.println("Employee Added Successfully");
                    }
                    else{
                        System.out.println("Employee not added! Try Again");
                    }

                }
                    break;

            case 2:
                System.out.println("Search the Employee with ID");
                empId = sc.nextInt();
                Employee empResult = readEmployee(empId);
                if(empResult == null){
                    System.out.println("Employee not found "+empId);
                }
                else {
                    System.out.println("Employee Id:"+empResult.empId+" Employee Name: "+empResult.empName);
                }

                break;

            case 3:
                    System.out.println("Edit Employee Details");
                    System.out.println("Enter the Employee Id");
                    empId = sc.nextInt();

                    int j = 0;
                    for (Employee e : emp) {
                        if (empId.equals(e.empId)) {
                            System.out.println("");
                            j++;
                        }
                        int ch1 = 0;
                        System.out.println("Edit: \n 1: Employee Id \n 2: Employee Name");
                        System.out.println("Enter choice");
                        ch1 = sc.nextInt();

                        switch (ch1) {
                            case 1:
                                System.out.println("Enter New Employee Id");
                                e.empId = sc.nextInt();
                                sc.nextLine();
                            case 2:
                                System.out.println("Enter New Employee Name");
                                e.empName = sc.nextLine();
                                sc.nextLine();
                            default:
                                System.out.println("");
                        }

                    }
                break;
            case 4:
                System.out.println("Delete Employee Details");
                System.out.println("Enter the Employee Id to be Deleted");
                empId = sc.nextInt();
                int k = 0;

                try {
                    for (Employee e:emp){
                        if (empId.equals(e.empId))
                        {
                            emp.remove(e.empId);
                            emp.remove(e.empName);
                            k++;
                        }
                    }
                    if (k==0){
                        System.out.println("Employee Details not found");
                    }
                }
                catch (Exception ex){
                    System.out.println(ex);
                }
            case 5:
                System.out.println("-----------Employee Details--------");

            case 6:
            default:
        }


    }

    public static boolean addEmployee(Employee employee){

        try {
            FileOutputStream file = new FileOutputStream(employee.empId+".ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(employee);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
            return true;

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static Employee readEmployee(Integer empId){
        Employee emp1 = null;
        try {
            FileInputStream file = new FileInputStream(empId+".ser");
            ObjectInputStream in = new ObjectInputStream(file);
            emp1 = (Employee)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");


        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return emp1;
    }
}
