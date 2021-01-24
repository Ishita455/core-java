package com.company.corejava.exceptiondemo;

public class Voter {
    private Integer age;
    private String name;
    public Voter(Integer age, String nm){
        this.name = nm;
        this.age = age;

    }

    public String eligibility(Integer age) throws InvalidAgeException{
        if(age<18){
            InvalidAgeException e = new InvalidAgeException(this.name+" not eligible for voting");
            throw e;
        }
        return "Congratulations "+this.name+" you are eligible for voting";
    }



}
