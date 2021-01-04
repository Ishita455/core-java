package com.company;

public class AreaMain {
    public static void main(String[] args){
        Area a = new Area();
        double r = a.area(2.3);
        System.out.println("Area of the Circle: "+r);

        double rect = a.area(4.5,6.9);
        System.out.println("Area of the rectangle: "+rect);

        String cal = a.area();
        System.out.println("Details: "+cal);

        String cal1 = a.area(34567, "Neil", 345.56);
        System.out.println("Employee Details: "+cal1);
    }
}
