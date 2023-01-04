package com.karmel;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the larger number: ");
        int n = input.nextInt();
        System.out.println("Enter the number whose occurrence u need to find: ");
        int m = input.nextInt();
        int count = 0;
        while(n>0){
            int temp = n%10;
            if(temp == m){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
