package com.company.assignment17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) throws IOException {

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
                System.out.println("Search the Employee with ID");
                empId = sc.nextInt();
                sc.nextLine();
                Employee empResult1 = readEmployee(empId);
                if(empResult1 == null){
                    System.out.println("Employee not found "+empId);
                }else {
                    System.out.println("Enter your new name");
                    empResult1.empName = sc.nextLine();
                    addEmployee(empResult1);
                    System.out.println("Successfully updated");

                }
                break;

            case 4:
                System.out.println("Delete Employee Details");
                System.out.println("Enter the Employee Id to be Deleted");
                empId = sc.nextInt();
                sc.nextLine();
                boolean s=false;

                Employee empResult2 = readEmployee(empId);
                if (empResult2 == null){
                    System.out.println("Employee not found"+empId);
                }
                else {
                    File file = new File(empId+".ser");
                    s = file.delete();
                }
                if(s){
                    System.out.println(empResult2.empId+"Successfully deleted");
                }
                break;

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

    public static Employee readEmployee(Integer empId) throws IOException {
        Employee emp1 = null;
        FileInputStream file = null;
        ObjectInputStream in = null;
        try {
            file = new FileInputStream(empId+".ser");
            in = new ObjectInputStream(file);
            emp1 = (Employee)in.readObject();
            System.out.println("Object has been deserialized");


        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            in.close();
            file.close();
        }
        return emp1;
    }
}
