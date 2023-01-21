package com.assingments;

import java.util.Scanner;
//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class conditional_loops_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Keep on entering number to find its sum and 0 to get results...");
        int negative_sum = 0;
        int positive_even = 0;
        int positive_odd = 0;
        while(true){
            System.out.print("Enter a number :");
            int n = in.nextInt();
            if(n == 0){
                break;
            }
            if(n < 0){
                negative_sum+= n;
                continue;
            }
            if(n%2 == 0){
                positive_even+= n;
            }
            else
            {
                positive_odd+= n;
            }
        }
        System.out.println("The sum of negative numbers is "+negative_sum);
        System.out.println("The sum of positive even numbers is "+positive_even);
        System.out.println("The sum of positive odd numbers is "+positive_odd);
    }
}
