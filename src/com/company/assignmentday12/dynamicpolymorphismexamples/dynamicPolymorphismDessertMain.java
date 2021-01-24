package com.company.assignmentday12.dynamicpolymorphismexamples;

public class dynamicPolymorphismDessertMain {
    public static void main(String[] args){
        IceCream i = new IceCream();
        i.display();
        Dessert d = new Dessert();
        d.display();
    }
}
