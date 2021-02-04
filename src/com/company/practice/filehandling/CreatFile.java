package com.company.practice.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args){
        try {
            File obj = new File("D:\\Learningjava\\Demo2.txt");
            if (obj.createNewFile()){
                System.out.println("File Created: "+ obj.getName());
            }
            else {
                System.out.println("File Already Exists");
            }
        }
        catch (IOException e){
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }

}
