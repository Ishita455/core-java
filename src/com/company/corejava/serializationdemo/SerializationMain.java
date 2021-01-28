package com.company.corejava.serializationdemo;

import com.sun.org.apache.bcel.internal.generic.F2L;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args) {

        EmployeeDemo obj = new EmployeeDemo(1.34f, "John","Physics");
        String filename = "file.ser";

        try {
            FileOutputStream file = new FileOutputStream(filename);

            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(obj);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
