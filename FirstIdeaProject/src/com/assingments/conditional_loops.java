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
        System.out.println("The area of the triangle is :"+f.format(areaOfTriangle(h, b))+" cm sq");
        System.out.println("To calculate the area of the Rectangle...");
        System.out.print("Enter a the length of the rectangle in cm: ");
        int l = in.nextInt();
        System.out.print("Enter a the breath of the rectangle in cm: ");
        int w = in.nextInt();
        System.out.println("The area of the rectangle is :"+f.format(areaOfRectangle(l, w))+" cm sq");
        System.out.println("To calculate the area of the Isosceles triangle...");
        System.out.print("Enter a the height of the Isosceles triangle in cm: ");
        int h2 = in.nextInt();
        System.out.print("Enter a the base of the Isosceles triangle in cm: ");
        int b2 = in.nextInt();
        System.out.println("The area of the Isosceles triangle is :"+f.format(areaOfIsoscelesTriangle(h2, b2))+" cm sq");
        System.out.println("To calculate the area of the Parallelogram...");
        System.out.print("Enter a the length of the parallelogram in cm: ");
        int l2 = in.nextInt();
        System.out.print("Enter a the breath of the parallelogram in cm: ");
        int w2 = in.nextInt();
        System.out.println("The area of the parallelogram is :"+f.format(areaOfParallelogram(l2, w2))+" cm sq");
    }
    //1
    static double areaOfCircle(int radius){
        return Math.PI * (radius*radius);
    }
    //2
    static double areaOfTriangle(double height, double base) {
        return (height*base)/2;
    }
    //3
    static double areaOfRectangle(double length, double breath){return length*breath;}
    //4
    static  double areaOfIsoscelesTriangle(double height, double base){
        return (height*base)/2;
    }
    //5
    static double areaOfParallelogram(double length, double breath){
        return areaOfRectangle(length,breath); // same as that of a rectangle
    }
}
