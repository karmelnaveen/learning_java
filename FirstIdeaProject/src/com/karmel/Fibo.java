package com.karmel;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = fibo(n);
        System.out.println(result);
    }
    public static int fibo(int n){
        if( n==0 || n==1){
            return n;
        }
        int prev = 0;
        int current = 1;
        for(int i=2; i <= n; i++){
            int temp = current;
            current = current+prev;
            prev = temp;
        }
        return current;
    }

}
