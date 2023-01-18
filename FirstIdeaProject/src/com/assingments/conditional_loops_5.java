package com.assingments;

import java.util.Scanner;
//        Addition Of Two Numbers
public class conditional_loops_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a n to find fibonacci up to that :");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int result = Fibo(i);
            System.out.print(result+"\t");
        }
        System.out.print("\nEnter a number to Subtract the Product and Sum of Digits :");
        int n2 = in.nextInt();
        question22(n2);
        System.out.print("\nEnter a number to find its factorial :");
        int n3 = in.nextInt();
        Factorial(n3);
        //Writing question 24 and 25 in a same loop
        int sum = 0;
        int largest = 0;
        System.out.println("Keep on entering number & to end enter 0...");
        while(true){
            System.out.print("Enter a number :");
            int number = in.nextInt();
            if(number == 0){
                break;
            }
            sum = sum + number; // sum all the numbers in loop
            if(number > largest){
                largest = number; // find the largest
            }
        }
        System.out.println("The sum all all these numbers is "+sum+" & the largest is "+largest);
        System.out.println("Enter 2 numbers to find its sum");
        System.out.print("Number 1 :");
        double a = in.nextDouble();
        System.out.print("Number 2 :");
        double b = in.nextDouble();
        Sum(a,b);
    }
    //21
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
    //22
    static void question22(int n){
        int sum = 0;
        int product = 1;
        while(n>0){
            int reminder = n%10;
            sum = sum + reminder;
            product = product * reminder;
            n = n/10;
        }
        System.out.println("The result is "+(product-sum));
    }
    //23
    static void Factorial(int n){
        for(int i = 1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }

    //25
    static void Sum(double a,double b){
        System.out.println("Their sum is "+a+b);
    }

}
