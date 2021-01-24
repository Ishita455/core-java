package com.company.assignmentday12;

public class EncapsulationDemo1 {

    public String userName;
    private int pswd;

    public void setUserName(String un){userName = un;}
    public void setPswd(int pd){pswd = pd;}

    public String getUserName(){return userName;}
    public int getPswd(){return pswd;}

}
