package com.assingments;

import java.util.Scanner;
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
        System.out.println("To Find the depreciation of an asset, Enter the following,");
        System.out.print("Total value of the asset :");
        double value = in.nextDouble();
        System.out.print("Rate of depreciation of that asset class :");
        double rod = in.nextDouble();
        System.out.print("Time duration in years :");
        double years = in.nextDouble();
        Depreciation(value,rod,years);
        System.out.println("To find the batting average, Enter the following,");
        System.out.print("Total runs scored :");
        double total = in.nextDouble();
        System.out.print("number of times out :");
        double outs = in.nextDouble();
        BattingAverage(total,outs);
    }
    //6
    static void CommissionPercentage(double amount,double commission){
        System.out.println("The commission percentage is"+((commission*100)/amount)+"%");
    }
    //7
    static void Power(int base, int power){
        System.out.println("The answer is "+Math.pow(base,power));
    }
    //8
    static void Depreciation(double value, double rateOfDepreciation, double years){
        System.out.println("The answer is "+value * Math.pow((1 - rateOfDepreciation / 100), years));//Formula of Depreciation
    }
    //9
    static void BattingAverage(double total,double outs){
        System.out.println("The answer is "+(total/outs));
    }


}
