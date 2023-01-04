package com.karmel;

import java.util.Scanner;

public class Largest {
    //Largest of 3 inputs
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(c,Math.max(a,b));
//        if( b > max){
//            max = b;
//        }
//        if( c > max){
//            max = c;
//        }

        System.out.print(max);
    }
}
