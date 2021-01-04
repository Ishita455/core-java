package com.company.corejava;

import java.util.Scanner;

public class FreqOfNoInArr {
    public static  void  main(String[] args){
        int arr[] = new int[]{20, 4, 5, 10, 20, 10, 5, 10};

        boolean check[] = new boolean[8];
        //Scanner scanner = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            int c=1;
            if(check[i]){
                continue;
            }
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    check[j] = true;
                    c++;
                }

            }
            System.out.println("the frequency of "+arr[i] +" is "+c);
        }
    }
}
