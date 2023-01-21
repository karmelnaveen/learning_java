package com.assingments;

import java.util.Scanner;
//        Calculate Average Marks
//        Sum Of N Numbers
//        Armstrong Number In Java
//        Find Ncr & Npr
public class conditional_loops_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To find Compound interest, Enter the following,");
        System.out.print("Principal Amount :");
        double principle = in.nextDouble();
        System.out.print("Rate of Interest :");
        double roi = in.nextDouble();
        System.out.print("Time in years :");
        double time = in.nextDouble();
        CompoundInterest(principle,roi,time);
        //Assume there is only 4 subjects
        System.out.println("To find average marks, Enter the following,");
        System.out.print("English :");
        double english = in.nextDouble();
        System.out.print("Tamil :");
        double tamil = in.nextDouble();
        System.out.print("Maths :");
        double maths = in.nextDouble();
        System.out.print("CS :");
        double cs = in.nextDouble();
        AverageMarks(english,tamil,maths,cs);
    }
    static void CompoundInterest(double principle,double roi,double time){
        System.out.println("The amount is "+(principle*Math.pow(1+(roi/100),time)));
    }
    static void AverageMarks(double english,double tamil,double maths,double cs){
        System.out.println("The average is "+((english+tamil+maths+cs)/4));
    }
}
