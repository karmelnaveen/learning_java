package com.assingments;

import java.util.Scanner;

public class conditional_loops_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To find the area of rhombus Enter its diagonals");
        System.out.print("Diagonal 1:");
        double a = in.nextDouble();
        System.out.print("Diagonal 2:");
        double b = in.nextDouble();
        areaOfRhombus(a,b);
        System.out.println("To find the area of equilateral triangle Enter its side in cm");
        System.out.print("Side :");
        double c = in.nextDouble();
        areaOfEQTriangle(c);
    }
    static void areaOfRhombus(double a,double b){
        double ans = (a*b)/2;
        System.out.println("The area of the rhombus is "+ans+"cm");
    }
    static void areaOfEQTriangle(double side){
        double ans = (Math.sqrt(3)/4)*side*side;
        System.out.println("The area of the equilateral triangle is "+ans+"cm");
    }
}
