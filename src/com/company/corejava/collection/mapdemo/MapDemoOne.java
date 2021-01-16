package com.company.corejava.collection.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemoOne {
    public static void main(String[] args){

        Map<Integer,String> mapOfEmployee = new HashMap<>();
        mapOfEmployee.put(111,"John");
        mapOfEmployee.put(555,"Alex");
        mapOfEmployee.put(333,"Peter");
        mapOfEmployee.put(444,"Joe");
        mapOfEmployee.put(null,null);
        mapOfEmployee.put(null,null);       //If the key n value is exactly same it overrides the whole entry of the map
        mapOfEmployee.put(null,"Ram");      //null is allowed in the Key as well as value
        mapOfEmployee.put(777,null);

        for(Map.Entry<Integer,String> m:mapOfEmployee.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            if(m.getValue()!=null && m.getValue().equals("Alex")){
                System.out.println("Found Alex at Key: "+m.getKey());
            }
        }
        System.out.println(mapOfEmployee.get(333));
        System.out.println(mapOfEmployee.size());       //Similarily there are other function like contains value, keys, remove, replace, remove all etc.



    }
}
