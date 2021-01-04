package com.company.corejava;

public class RightAngleStructure {
    public static void main(String[] args){
        char[] name = new char[]{'I','S','H','I','T','A'};
        int i,j;
        for(i=0; i<name.length; i++){
            for (j=0; j<i+1; j++){
                System.out.print(name[j]);
            }
            System.out.print("\n");
        }

    }
}

