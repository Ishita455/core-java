package com.company.corejava.collection.listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemoTwo {
    public static void main(String[] args) {

        //List maintain the order of insertion
        //ArrayList<String> fruitsList = new ArrayList<>();
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Mango");        //Adds a string to the list
        fruitsList.add("Apple");
        fruitsList.add("papaya");
        fruitsList.add(null);           //Allows to add null value

        System.out.println(fruitsList.get(1));    //Gets the list item at the index 1
        fruitsList.add(1, "Grapes");     //Adds new element grapes at index 1
        System.out.println(fruitsList.get(2));
        System.out.println(fruitsList.size());
        fruitsList.remove("Apple");           //Its removes the element Apple
        fruitsList.set(2,"Orange");             //Replace element in the index 2 with orange

        for (String a : fruitsList) {
            System.out.println(a);

        }
        if (fruitsList.contains("Mango")) {
            System.out.println("Its present");
        } else {
            System.out.println("its not present");
        }
        if (fruitsList.isEmpty()) {
            System.out.println("Its Empty");
        } else {
            System.out.println("list is not empty");
        }

        fruitsList = new LinkedList<>();

    }
}
