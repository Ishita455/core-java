package com.company.practice.practiceserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args){
        StudentDemo s1 =null;
        String filename = "student.ser";
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            s1 = (StudentDemo)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");

            System.out.println("Student Id: "+s1.stId);
            System.out.println("Student Name: "+s1.stName);

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
