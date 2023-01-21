package com.assingments;

import java.util.Scanner;
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
        System.out.println("To calculate future value, Enter the following,");
        System.out.print("PresentValue :");
        double PresentValue = in.nextDouble();
        System.out.print("Rate Of Interest :");
        double rateOfInterest = in.nextDouble();
        System.out.print("Compounding Period :");
        double compoundingPeriod = in.nextDouble();
        FutureValue(PresentValue, rateOfInterest, compoundingPeriod);
        System.out.println("Enter two numbers to find its HCF & LCM");
        System.out.print("Number 1:");
        int n1 = in.nextInt();
        System.out.print("Number 2:");
        int n2 = in.nextInt();
        Lcm(n1,n2);
        Hcf(n1,n2);
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
//    Future Value (FV) = PV × (1 + r) ^ n
//    Where: PV = Present Value. r = Interest Rate (%) n = Number of Compounding Periods.
    static void FutureValue(double PresentValue,double rateOfInterest,double compoundingPeriod){
        double fv = PresentValue *(Math.pow((1+rateOfInterest/100),compoundingPeriod));
        System.out.println("The future value is:"+fv);
    }
    static void Lcm(int n1, int n2){
        int largest = Math.max(n1,n2);
        while(true){
            if(largest%n1 == 0 && largest%n2 ==0){
                System.out.println("The LCM of "+n1+" and "+n2+" is:"+largest);
                break;
            }
            largest++;
        }
    }
    static void Hcf(int n1, int n2){
        int hcf = 1;
        for(int i =1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0 ){
                hcf = i;
            }
        }
        System.out.println("The HCF of "+n1+" and "+n2+" is:"+hcf);
    }
}
