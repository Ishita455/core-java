package com.company.corejava.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args){
        try {
            File myobj = new File("D:\\Learningjava\\Demo1.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
