package com.assingments;

import java.util.Scanner;
//Perfect Number In Java
//Check Leap Year Or Not
//Sum Of A Digits Of Number
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
}
