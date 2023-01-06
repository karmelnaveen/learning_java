package com.assingments;

import java.util.Scanner;

//01-flow-of-program
public class flow_of_program {
    public static void main(String[] args) {
        System.out.print("Enter a year :");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        //1
        if(isLeapYear(year)){
            System.out.printf(year+" is a leap year...\n");
        }else {
            System.out.printf(year+" is not a leap year...\n");
        }
        System.out.println("Enter First number");
        int a = in.nextInt();
        System.out.println("Enter Second number");
        int b = in.nextInt();
        //2
        System.out.printf("Their sum is "+sum(a,b)+"\n");
        System.out.println("Enter a Number to print its multiplication table");
        int num = in.nextInt();
        //3
        multiplicationTable(num);

    }
    static boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        }
        if(year % 100 == 0){
            return false;
        }
        return year % 4 == 0;
    }
    static int sum(int a, int b){
        return a+b;
    }
    static void multiplicationTable(int num){
        for(int i = 1;i <= 10;i++){
            System.out.println(i+"*"+num+"="+i*num);
        }
    }
}
