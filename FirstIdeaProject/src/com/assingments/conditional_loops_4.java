package com.assingments;

import java.util.Scanner;
//        Volume Of Pyramid
//        Curved Surface Area Of Cylinder
//        Total Surface Area Of Cube
public class conditional_loops_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To Find the volume of the cylinder..");
        System.out.print("Enter its height :");
        double height = in.nextDouble();
        System.out.print("Enter its radius :");
        double radius = in.nextDouble();
        volumeOfCylinder(height,radius);
        System.out.println("To Find the volume of the sphere..");
        System.out.print("Enter its radius :");
        double r = in.nextDouble();
        volumeOfSphere(r);
        System.out.println("To Find the volume of the pyramid..");
        System.out.print("Enter its length :");
        double l = in.nextDouble();
        System.out.print("Enter its width :");
        double w = in.nextDouble();
        System.out.print("Enter its height :");
        double h = in.nextDouble();
        volumeOfPyramid(l,w,h);
    }

    //16
    static void volumeOfCylinder(double height, double radius){
        System.out.println("The volume of the cylinder is "+Math.PI*(radius*radius)*height);
    }
    //17
    static void volumeOfSphere(double r) {
        System.out.println("The volume of the cylinder is "+(4/3)*Math.PI*(Math.pow(r,3)));
    }
    //18
    static void volumeOfPyramid(double length,double width,double height){
        System.out.println("The volume of the pyramid is "+(length*width*height)/3);
    }

}
