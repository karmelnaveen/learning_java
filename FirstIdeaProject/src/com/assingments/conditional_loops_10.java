package com.assingments;

import java.util.Scanner;
//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class conditional_loops_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a alphabet to find whether its consonant or vowel :");
        char alphabet = in.next().charAt(0);
        char ch = Character.toLowerCase(alphabet);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        System.out.print("Enter a number to find whether its perfect or not :");
        int n = in.nextInt();
        if(PerfectNumber(n)){
            System.out.println(n+" is a perfect number");
        }else {
            System.out.println(n+" is not a perfect number");
        }
        System.out.println("Enter a number to find whether its a leap year or not :");
        int year = in.nextInt();
        if(isLeapYear(year)){
            System.out.printf(year+" is a leap year...\n");
        }else {
            System.out.printf(year+" is not a leap year...\n");
        }
        System.out.println("Enter a number to find sum of its digits :");
        int digit = in.nextInt();
        DigitSum(digit);
    }

    static boolean PerfectNumber(int n){
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        return sum == n;
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
    static void DigitSum(int n){
        int sum = 0;
        while(n>0){
            int reminder = n%10;
            sum+=reminder;
            n = n/2;
        }
        System.out.print(sum);
    }
}
