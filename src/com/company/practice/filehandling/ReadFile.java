package com.company.practice.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try {
            File obj = new File("D:\\Learningjava\\Demo2.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
