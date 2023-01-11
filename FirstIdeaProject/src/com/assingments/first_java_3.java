package com.assingments;

import java.util.Scanner;

public class first_java_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibo(n);
    }
    static void fibo(int n){
        int first = 0;
        int second = 1;
        int nth = 0;
        for(int i = 0; i <n;i++){
            System.out.print(nth+"\t");
            nth = first+second;
            first = second;
            second = nth;
        }

    }
    
}
