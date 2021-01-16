package com.company.corejava.collection.setdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoOne {
    public static void main(String[] args){

        //Set does not maintain the order of insertion
        Set<Integer> rolls = new HashSet<>();           //Allows to add null value
        //TreeSet implements the sorted set interface
        //Set<Integer> rolls = new TreeSet<>();       //TreeSet helps us to sort the set in the ascending order //If we add null value then it gives the null pointer exception at run time
        rolls.add(1);
        rolls.add(5);
        rolls.add(3);
        rolls.add(99);

        rolls.add(null);
        for(Integer r:rolls){
            System.out.println(r);
        }
        System.out.println(rolls.size());
        rolls.add(3);
        rolls.add(99);
        System.out.println(rolls.size());       //Size remains same as the duplicates are overrides
        rolls.remove(99);
        System.out.println(rolls.size());
        rolls.clear();                          //Clears the whole set
        System.out.println(rolls.size());
    }
}
