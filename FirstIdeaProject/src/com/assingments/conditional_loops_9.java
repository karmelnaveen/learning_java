package com.assingments;

import java.util.Scanner;
//        Find if a number is palindrome or not
//        Future Investment Value
//        HCF Of Two Numbers Program
//        LCM Of Two Numbers
public class conditional_loops_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("To reverse a word, Enter it :");
        String word= in.next();
        Reverse(word);
        System.out.print("To find a number whether it is palindrome or not, Enter it :");
        int n = in.nextInt();
        if(Palindrome(n)){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    static void Reverse(String word){
        StringBuilder reverse = new StringBuilder();
        for(int i=1;i<=word.length();i++){
            reverse.append(word.charAt(word.length() - i));
        }
        System.out.println("The reversed word is "+reverse);
    }
    static boolean Palindrome(int n){
        int original = n;
        int reversed = 0;
        while(n>0){
            int rem = n%10;
            reversed = reversed *10 + rem;
            n = n/10;
        }
        return original==reversed;
    }
}
