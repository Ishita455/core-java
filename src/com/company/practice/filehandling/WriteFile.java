package com.company.practice.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException{
        FileWriter myWr = null;
        try{
           myWr = new FileWriter("D:\\Learningjava\\Demo2.txt");
           myWr.write("my second program on File Handling");
           System.out.println("Successfully wrote");
        }
        catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
        finally {
            myWr.close();
        }
    }
}
