package com.assingments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class conditional_loops {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00"); //Formatting
        System.out.println("Enter a the radius of the circle in cm");
        int r = in.nextInt();
        System.out.println("The area of the circle is :"+f.format(areaOfCircle(r))+" cm sq");
        System.out.println("To calculate the area of the triangle...");
        System.out.print("Enter a the height of the triangle in cm: ");
        int h = in.nextInt();
        System.out.print("Enter a the base of the triangle in cm: ");
        int b = in.nextInt();
        System.out.println("The area of the circle is :"+f.format(areaOfTriangle(h, b))+" cm sq");
    }
    //1
    static double areaOfCircle(int radius){
        return Math.PI * (radius*radius);
    }
    static double areaOfTriangle(double height, double base) {
        return (height*base)/2;
    }
}
