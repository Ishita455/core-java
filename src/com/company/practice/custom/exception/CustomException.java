package com.company.practice.custom.exception;

import com.company.corejava.exceptiondemo.InvalidAgeException;

public class CustomException {
    public static void main(String[] args){
        try {
            MarriageCustomException m = new MarriageCustomException(16,"Neha");
            String s = m.eligibility(14);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
