package com.company.corejava;

import java.util.Scanner;

public class MenuMain {
    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total no of Menu to be added");
        int noOfMenu = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the restaurant name");
        Menu.restaurantName = scanner.nextLine();

        Menu m[] = new Menu[noOfMenu];

        for (int i=0; i<m.length; i++) {

            m[i] = new Menu();

            System.out.println("Enter the menu name");
            String mn = scanner.nextLine();
            m[i].setMenuName(mn);

            System.out.println("Enter the price of the Dish");
            int mp = scanner.nextInt();
            m[i].setMenuPrice(mp);

            System.out.println("Enter the type of menu Veg/No veg");
            String mt = scanner.nextLine();
            m[i].setMenuType(mt);

        }

        System.out.println("*********************Menu List*********************");
            for (Menu mn:m) {

                System.out.println("Restaurant Name: "+Menu.getRestaurantName()+" Menu Name: "+mn.getMenuName()+ " Menu Price: "+mn.getMenuPrice()+" Menu Type: "+mn.getMenuType());
            }

    }
}
