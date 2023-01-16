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
        System.out.println("To find the perimeter of the circle Enter its side in cm");
        System.out.print("radius :");
        double d = in.nextDouble();
        perimeterOfCircle(d);
        System.out.println("To find the perimeter of the equilateral triangle Enter its side in cm");
        System.out.print("Side :");
        double e = in.nextDouble();
        perimeterOfEQTriangle(e);
        System.out.println("To find the perimeter of the parallelogram enter its side in cm");
        System.out.print("Side :");
        double f = in.nextDouble();
        System.out.print("Base :");
        double g = in.nextDouble();
        perimeterOfParallelogram(f,g);
    }
    //6
    static void areaOfRhombus(double a,double b){
        double ans = (a*b)/2;
        System.out.println("The area of the rhombus is "+ans+"cm");
    }
    //7
    static void areaOfEQTriangle(double side){
        double ans = (Math.sqrt(3)/4)*side*side;
        System.out.println("The area of the equilateral triangle is "+ans+"cm");
    }
    //8
    static void perimeterOfCircle(double radius){
        double ans = 2*Math.PI*radius;
        System.out.println("The perimeter of the circle is "+ans+"cm");
    }
    //9
    static void perimeterOfEQTriangle(double side){
        double ans = 3*side;
        System.out.println("The perimeter of the equilateral triangle is "+ans+"cm");
    }
    //10
    static void perimeterOfParallelogram(double side,double base){
        double ans = 2*(side+base);
        System.out.println("The perimeter of the parallelogram triangle is "+ans+"cm");
    }

}
