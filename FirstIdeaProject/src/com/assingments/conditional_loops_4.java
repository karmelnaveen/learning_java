package com.assingments;

import java.util.Scanner;

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
        System.out.println("To Find the curved surface area of a cylinder..");
        System.out.print("Enter its radius:");
        double r2 = in.nextDouble();
        System.out.print("Enter its  height:");
        double h2 = in.nextDouble();
        curvedSurfaceArea(r2,h2);
        System.out.println("To Find the surface area of a cube..");
        System.out.print("Enter its side:");
        double a = in.nextDouble();
        surfaceAreaOfCube(a);
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
    //19
    static void curvedSurfaceArea(double radius, double height){
        System.out.println("The curved Surface Area of the cylinder is "+2*(Math.PI*radius*height));
    }
    //20
    static void surfaceAreaOfCube(double side){
        System.out.println("The curved Surface Area of the cube is "+6*Math.pow(side,2));
    }
}
