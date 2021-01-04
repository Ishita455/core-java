package com.company.corejava;

public class Menu {
    int menuPrice;
    String menuName;
    String menuType;
    static  String restaurantName;

    public  void setMenuName(String mn){menuName = mn;}
    public void setMenuPrice(int mp){menuPrice = mp;}
    public void setMenuType(String mt){menuType = mt;}
    public  void setRestaurantName(String rn){restaurantName = rn;}

    public String getMenuName(){return menuName;}
    public int getMenuPrice(){return menuPrice;}
    public String getMenuType(){return  menuType;}
    public  static String getRestaurantName(){return  restaurantName;}

    }

