package com.company.corejava.serializationdemo;

import java.io.*;

public class DeserializationMain {
    public static void main(String[] args){
        EmployeeDemo obj1 = null;
        String filename = "file.ser";

        try {
            FileInputStream file = new FileInputStream(filename);

            ObjectInputStream in = new ObjectInputStream(file);

            obj1 = (EmployeeDemo)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been Deserialized");

            System.out.println("empId= "+obj1.empId);
            System.out.println("empName= "+obj1.empName);
            System.out.println("Dept: " +obj1.department);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
