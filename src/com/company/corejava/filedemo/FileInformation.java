package com.company.corejava.filedemo;

import java.io.File;

public class FileInformation {
    public static void main(String[] args){
        File myObj = new File("D:\\Learningjava\\Demo1.txt");

        if (myObj.exists()){

            System.out.println("File Name: "+myObj.getName());

            System.out.println("Absolute Path: "+myObj.getAbsolutePath());

            System.out.println("File size in bytes: "+myObj.length());
        }
        else {
            System.out.println("The File does not exist");
        }
    }
}
