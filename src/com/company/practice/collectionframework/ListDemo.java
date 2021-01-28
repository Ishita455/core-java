package com.company.practice.collectionframework;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        l.add("laptop");
        l.add("mobile");
        l.add(344.44);
        l.add(234);

        for(int i=0; i<l.size(); i++){
            System.out.println("Items: "+l.get(i));
        }
    }
}
