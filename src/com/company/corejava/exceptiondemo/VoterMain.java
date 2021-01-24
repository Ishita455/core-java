package com.company.corejava.exceptiondemo;

public class VoterMain {
    public static void main(String[] args){
        try{                                            //there can be only one try block but many catch block
            Voter v1 = null; //= new Voter(32,"Geeta");
           String r = v1.eligibility(32);
            System.out.println(r);

            Voter v2 = new Voter(8,"Neha");
            String r2 = v2.eligibility(8);
            System.out.println(r2);

        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());

        }
        catch (Exception e){        //Generic catch block should be always at the end
            e.printStackTrace();
            //System.out.println(e.getStackTrace());
        }
    }
}
