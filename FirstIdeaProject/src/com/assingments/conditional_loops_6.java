package com.assingments;

import java.util.Scanner;
//Factorial Program In Java
//        Calculate Electricity Bill
//        Calculate Average Of N Numbers
//        Calculate Discount Of Product
//        Calculate Distance Between Two Points
public class conditional_loops_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial:");
        int n = in.nextInt();
        Factorial(n);
        System.out.print("Enter your total consumption in units:");
        double unit = in.nextDouble();
        EBill(unit);
    }
    //1
    static void Factorial(int n){
        for(int i = 1;i<n;i++){
            if(n%i==0){
                System.out.print(i+"\t");
            }
        }
        System.out.println("\n");
    }
    static void EBill(double unit){
        double amount = 0;
        //Rough calculation
//        1 - 100 unit - 1.5/= --> cost per unit
//        101-200 unit - 2.5/=
//        201-300 unit - 4/=
//        above 300 - fixed charge 1500/=
        if(unit <= 0){
            System.out.println("Enter a value above 0");
        }
        else if(unit <= 100){
            amount = unit*1.5;
        } else if (unit <= 200) {
            amount = (100*1.5) + ((unit -100)*2.5);
        } else if (unit <= 300) {
            amount = (100*1.5) + (200*2.5) + ((unit -200)*4);
        } else if (unit > 300) {
            amount = 1500;
        }
        System.out.println("The total bill is :"+amount);
    }
}
