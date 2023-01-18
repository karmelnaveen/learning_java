package com.assingments;

import java.util.Scanner;

public class conditional_loops_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a n to find fibonacci up to that :");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int result = Fibo(i);
            System.out.print(result+"\t");
        }
    }
    static int Fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev = 0;
        int current = 1;
        for(int i = 2; i<n;i++){
            int temp = current;
            current = current+prev;
            prev = temp;
        }
        return current;
    }
}
