package com.assingments;

import java.util.Scanner;
//        Power In Java
//        Calculate Depreciation of Value
//        Calculate Batting Average
//        Calculate CGPA Java Program
public class conditional_loops_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To find commission percentage, Enter the following,");
        System.out.print("Total sales amount :");
        double amount = in.nextDouble();
        System.out.print("Your commission :");
        double commission = in.nextDouble();
        CommissionPercentage(amount,commission);
        System.out.println("To find the power, Enter the following,");
        System.out.print("Base :");
        int base = in.nextInt();
        System.out.print("Power :");
        int power = in.nextInt();
        Power(base,power);
    }
    static void CommissionPercentage(double amount,double commission){
        System.out.println("The commission percentage is"+((commission*100)/amount)+"%");
    }
    static void Power(int base, int power){
        System.out.println("The answer is "+Math.pow(base,power));
    }


}
