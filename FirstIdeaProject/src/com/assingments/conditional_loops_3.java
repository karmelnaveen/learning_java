package com.assingments;

import java.util.Scanner;
//Perimeter Of Rectangle
//        Perimeter Of Square
//        Perimeter Of Rhombus
//        Volume Of Cone Java Program
//        Volume Of Prism
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
    }
    //11
    static void perimeterOfRectangle(double l,double w){
        System.out.println("The perimeter of the rectangle is"+2*(l+w));
    }
    //12
    static void perimeterOfSquare(double a){
        System.out.println("The perimeter of the square is"+4*a);
    }


}
