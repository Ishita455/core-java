package com.company;

public class Student {

  int rollNo;
  String name;
 static String collegeName;       //Cllg Name is globally shared object

  public void setRollNo(int rn){rollNo = rn;}
  public void setName(String nm){name = nm;}
  public void setCollegeName(String cn){collegeName = cn;}
  public int getRollNo(){return rollNo;}
  public String getName(){return name;}
  public static String getCollegeName(){return collegeName;}

  public void setCollegeName() {
  }
}
