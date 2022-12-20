package com.karmel;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345689;
        int ans = 0;
        while(n>0){
            int reminder = n%10;
            n = n/10;

            ans = ans * 10 + reminder;
        }
        System.out.println(ans);
    }
}
