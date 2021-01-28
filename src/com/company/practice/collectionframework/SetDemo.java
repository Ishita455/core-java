package com.company.practice.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Gill");
        names.add("Dino");
        names.add("siya");

        System.out.println(names);
        names.remove("Dino");
        System.out.println(names);
    }
}
