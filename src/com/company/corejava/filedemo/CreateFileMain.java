package com.company.corejava.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateFileMain {
    public static void main(String[] args){
        try {
            File myObj = new File("D:\\Learningjava\\Demo1.txt");
            if (myObj.createNewFile()){
                System.out.println("File Created: "+myObj.getName());
            }
            else {
                System.out.println("File Already Exists");
            }

        } catch (IOException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
