package com.company.corejava.inheritence;

import com.company.corejava.inheritence.Citizen;

public class CitizenProtected extends Citizen {
    int citizenId = 234567;
    protected String citizenName = "John";

    public void test(){
        System.out.println("TEST");
    }

    public CitizenProtected(){

        super();        //this line calls the super class default constructor, even though we dont mention super keyword it will still call the parent class constructor
        System.out.println("Im the constructor of child class citizen protected");
    }

    public void display(){
      /*  Citizen c = new Citizen();
        c.healthDetails();
        c.citizenDetails();  */
        super.citizenDetails();
        super.healthDetails();      //calling super class method with super keyword same as line 15
        System.out.println("Your citizen Id is: "+this.citizenId);      //"this" helps to access the member variables function of the  current class
        this.test();
    }
}
