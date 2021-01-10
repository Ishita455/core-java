package com.company.corejava.inheritence;

public class Citizen implements Country,State{

    public Citizen(){
        System.out.println("Im constructor of parent class Citizen");
    }


    protected void citizenDetails(){
        System.out.println("Health Card ID : "+healthId);
        System.out.println("Aadhar ID: "+aadharId);
    }


    @Override
    public void healthDetails() {
        System.out.println("Your Health is Good! ");
    }

}
