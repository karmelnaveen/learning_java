package com.assingments;

import java.util.Scanner;
public class conditional_loops_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To find the perimeter of rectangle...");
        System.out.print("Enter its length :");
        double l = in.nextDouble();
        System.out.print("Enter its width :");
        double w = in.nextDouble();
        perimeterOfRectangle(l, w);
        System.out.println("To find the perimeter of square...");
        System.out.print("Enter its side :");
        double a = in.nextDouble();
        perimeterOfSquare(a);
        System.out.println("To find the perimeter of rhombus...");
        System.out.print("Enter its side :");
        double b = in.nextDouble();
        perimeterOfRhombus(b);
        System.out.println("To find the volume of cone...");
        System.out.print("Enter its height :");
        double h = in.nextDouble();
        System.out.print("Enter its radius :");
        double r = in.nextDouble();
        volumeOfCone(h,r);
        System.out.println("To find the volume of prism...");
        System.out.print("Enter its base :");
        double b2 = in.nextDouble();
        System.out.print("Enter its height :");
        double h2 = in.nextDouble();
        volumeOfPrism(b2,h2);
    }
    //11
    static void perimeterOfRectangle(double l,double w){
        System.out.println("The perimeter of the rectangle is "+2*(l+w));
    }
    //12
    static void perimeterOfSquare(double a){
        System.out.println("The perimeter of the square is "+4*a);
    }
    //13
    static void perimeterOfRhombus(double a){
        perimeterOfSquare(a); //same formula as that of square
    }
    //14
    static void volumeOfCone(double height,double radius){
        System.out.println("The perimeter of the square is "+Math.PI*(radius*radius)*(height/2));
    }
    //15
    static void volumeOfPrism(double base,double height){
        System.out.println("The volume of the prism is "+base*height);
    }



}
