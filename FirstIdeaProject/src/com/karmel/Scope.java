package com.karmel;
//In simple words in block or function scope you can access any variable outside
//Anything you initialize inside them will not be accessible outside
public class Scope {
    public static void main(String[] args) {
        //Function scope
        int a = 25;
        int b = 30;
        System.out.println("a:"+a+" b:"+b);
        System.out.println("Swapping...");
        {
            //int a = 10;//This will throw an error, you cannot initialize again inside a block
            a = 100; //You can alter its value
            int c = 100; //If you initialize something it will remain inside the block. Not accessible outside it
            System.out.println(c);
        }
        swap(a, b);
        int c = 100;// Anything initialized inside the block can be initialized outside again
        System.out.println(c);
        System.out.println("a:"+a+" b:"+b);//The original value will be returned
        //scope in loops
        for(int i = 0;i<4; i++)
        {
            //int a = 10 //This will throw an error, you cannot initialize again inside a block
            a = 999; //You can alter its value
            System.out.println(a);
            System.out.println(i);//If you initialize something it will remain inside the block. Not accessible outside it
        }
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a+" b:"+b);
    }

}
