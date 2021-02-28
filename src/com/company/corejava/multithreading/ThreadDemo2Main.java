package com.company.corejava.multithreading;

public class ThreadDemo2Main{
    public static void main(String[] args){
        new ThreadDemo2("1st thread");
        new ThreadDemo2("2nd thread");
        new ThreadDemo2("3rd thread");

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            System.out.println("Interruption occurs in the main thread");
        }
        System.out.println("We are existing from main thread");
    }
}
