package com.company.corejava.collection.listdemo;

import java.util.ArrayList;

public class GenericsListDemo {
    public static void  main(String[] args){

        //empIdList only allows to add Integer datatype to the list as we had added a contrain through generic
        ArrayList<Integer> empIdList = new ArrayList<Integer>();
        ArrayList<String> nameList = new ArrayList<>();

        empIdList.add(123);
        //empIdList.add("Apple");     //Generics enforces Strict DataType contraints on the List
        nameList.add("Amit");
       // nameList.add(123);         //Generics enforces Strict DataType contraints on the List
    }
}
