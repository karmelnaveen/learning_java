package com.karmel;

public class Shadowing {
    static int x = 1000;//Using static as we need to use it in static methods
    public static void main(String[] args) {
        System.out.println(x);// This will give 1000
        int x = 999;
        System.out.println(x);//This will give 999 i.e. it shadows the x(1000) with x(999) since it has higher scope
        //When two variables with a same name overlap in its scope,
        //the variable with higher scope gets shadowed
        //Lower level is overriding/Shadowing the upper level
    }
}
