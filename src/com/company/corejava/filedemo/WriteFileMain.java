package com.company.corejava.filedemo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileMain {
    public static void main(String[] args) throws IOException {
        FileWriter myWrite = null;
        try {
            myWrite = new FileWriter("D:\\Learningjava\\Demo1.txt");
            myWrite.write("Hello World!");
           // myWrite.close();
            System.out.println("Successfully wrote");

        } catch (IOException e) {
            System.out.println("Cannot write coz of the problem");
            e.printStackTrace();
        }
        finally {
            myWrite.close();

        }
    }
}
