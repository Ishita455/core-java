package com.company.corejava.multithreading;

public class ThreadDemo1 extends Thread{
    public void run(){
        int a = 10;
        int b = 12;
        int output = a + b;
        System.out.println("Thread started and is running");
        System.out.println("Sum= "+output);
    }

}
