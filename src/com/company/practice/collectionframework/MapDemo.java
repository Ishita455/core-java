package com.company.practice.collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){

        Map<String,Integer> scores = new LinkedHashMap<>();
        scores.put("Sachin",86);
        scores.put("Virat", 54);
        scores.put("Dhoni",47);

        for(Map.Entry<String,Integer> s:scores.entrySet()){
            System.out.println(s.getKey() +" "+s.getValue());
        }
    }
}
