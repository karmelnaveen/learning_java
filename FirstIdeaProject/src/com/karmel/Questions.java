package com.karmel;

import java.util.Scanner;
// Whether a number is prime or not
// Whether a number is armstrong number or not
public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        boolean ans2 = isArmstrong(n);
        System.out.println("Prime- "+ans);
        System.out.println("Armstrong- "+ans2);
        //All 3 digit armstrong Numbers
        for(int i =100; i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n) {
            if(n%c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int reminder = n % 10;
            sum += reminder*reminder*reminder; //cube of the reminder
            n = n/10;
        }
        return sum == original;
    }
}
