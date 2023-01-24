package Methods;

import java.util.Scanner;

//4.Write a program to print the sum of two numbers entered by user by defining your own method.
//5.Define a method that returns the product of two numbers entered by user.
//6.Write a program to print the circumference and area of a circle of radius,
// entered by user by defining your own method.
public class methods_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find its sum & product,");
        System.out.print("Number 1 :");
        int n1 = in.nextInt();
        System.out.print("Number 2 :");
        int n2 = in.nextInt();
        Sum(n1,n2);
        Product(n1,n2);
        System.out.println("To find Circumference and area of the circle,");
        System.out.print("Enter its radius :");
        double radius = in.nextDouble();
        Circle(radius);
    }
    static void Sum(int a, int b){
        System.out.println("The sum is "+(a+b));
    }
    static void Product(int a,int b){
        System.out.println("The product is "+(a*b));
    }
    static void Circle(double radius){
        System.out.println("The circumference of the circle is :"+(2*Math.PI*radius));
        System.out.println("The area of the circle is :"+(Math.PI*radius*radius));
    }
}
