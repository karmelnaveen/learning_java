package com.assingments;

import java.util.Scanner;

public class first_java_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        //5
        if(num1>num2){
            System.out.println(num1+" is greater");
        } else if (num2>num1) {
            System.out.println(num2+" is greater");
        }else{
            System.out.println("Both are equal");
        }
        System.out.printf("To convert Indian Rupee to USD, Enter the value: ");
        float indianRupees = in.nextFloat();
        convertToUSD(indianRupees);
    }
    static void convertToUSD(float amount){
        System.out.println(String.format("%.3f", amount/82.34)+" USD");
    }
}
