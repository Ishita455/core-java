package com.company.practice.custom.exception;

import com.company.corejava.exceptiondemo.InvalidAgeException;

public class MarriageCustomException {
    Integer age;
    String personName;

    public MarriageCustomException(Integer age,String personName){
        this.age = age;
        this.personName = personName;
    }

    public String eligibility(Integer age) throws InvalidAgeException{
        if(age<22){
            InvalidAgeException e = new InvalidAgeException("Not Invalid");
            throw e;
        }
        return "Eligible";
    }
}
