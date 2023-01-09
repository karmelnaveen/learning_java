package com.assingments;

import java.util.Scanner;

public class first_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check whether its even or odd: ");
        int num = in.nextInt();

        if(isOdd(num)){
            System.out.printf(num+" is odd");
        }else{
            System.out.println(num+" is even");
        }
        System.out.println("Enter Your name");
        String name = in.next();
        greeting(name);
        System.out.println("To Calculate Simple Interest enter the following below,");
        System.out.print("Principal :");
        int principal = in.nextInt();
        System.out.print("Time Duration in years :");
        int time = in.nextInt();
        System.out.print("Rate of interest as integer :");
        int rateOfInterest = in.nextInt();
        simpleInterest(principal,time,rateOfInterest);
    }
    //1
    static boolean isOdd(int n){
        return n % 2 != 0;
    }
    static void greeting(String name){
        System.out.println("Hello "+name+" Welcome to Planet Earth");
    }
    static void simpleInterest(int principal,int time,int rateOfInterest){
        int ans = principal * (1 + rateOfInterest*time);
        System.out.println("The final amout is :"+ans);
    }

}
