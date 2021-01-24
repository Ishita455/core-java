package com.company.assignmentday12;

public class ThisKeyword {
    int x;

    public ThisKeyword(int x){
        this.x = x;
    }
    public static void main(String[] args){
        ThisKeyword ths = new ThisKeyword(34);
        System.out.println("Value of x: "+ ths.x);
    }
}
