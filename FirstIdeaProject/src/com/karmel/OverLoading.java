package com.karmel;
//Two are more functions can exist in the same name if the parameters are different
public class OverLoading {
    public static void main(String[] args) {
        fun(32);
        fun("Trail");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
