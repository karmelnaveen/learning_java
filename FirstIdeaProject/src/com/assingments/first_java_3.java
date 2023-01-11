package com.assingments;

import java.util.Scanner;

public class first_java_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find fibonaaci values");
        int n = in.nextInt();
        fibo(n);
        System.out.println("Enter a word to find whether it is palindrome or not");
        String word = in.next();
        if(isPalindrome(word)){
            System.out.println(word +" is a palindrome");
        }else {
            System.out.println(word +" is not a palindrome");
        }
        System.out.println("Enter two number to find armstrong number between them");
        System.out.print("First :");
        int start = in.nextInt();
        System.out.print("Second :");
        int end = in.nextInt();
        for(int i = start;i<=end;i++){
            if(armstrong(i)){
                System.out.print(i+"\t");
            }
        }
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
        System.out.println("\n");

    }
    static boolean isPalindrome(String word){
        StringBuilder reversed = new StringBuilder();
        for (int i = 1 ; i<=word.length();i++){
            reversed.append(word.charAt(word.length() - i));
        }
        return word.equalsIgnoreCase(reversed.toString());
    }
    static boolean armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=Math.pow(rem,3);
            n = n/10;
        }
        return sum == original;
    }
    
}
