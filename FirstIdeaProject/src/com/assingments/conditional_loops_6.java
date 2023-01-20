package com.assingments;

import java.util.Scanner;
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
        int total = 0;
        System.out.println("Keep on entering number to find its total & 0 to stop");
        //3
        while (true){
            System.out.print("Enter a number :");
            int number = in.nextInt();
            if(number == 0){
                break;
            }
            total += number;
        }
        System.out.println("The total is :"+total);
        System.out.print("Enter original Price :");
        double price = in.nextDouble();
        System.out.print("Enter discount percentage :");
        double percentage = in.nextDouble();
        Discount(price,percentage);
        System.out.println("To calculate the distance between two points,");
        System.out.println("Ex: (x1,x2) & (y1,y2) --- > Enter the following");
        System.out.println("x1 :");
        int x1 = in.nextInt();
        System.out.println("x2 :");
        int x2 = in.nextInt();
        System.out.println("y1 :");
        int y1 = in.nextInt();
        System.out.println("y2 :");
        int y2 = in.nextInt();
        DistanceBtwTwoPoints(x1,x2,y1,y2);
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
    //2
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
    //4
    static void Discount(double price, double discount){
        double price_reduction = price *(discount/100);
        System.out.println("The price reduction is "+price_reduction+" and you pay "+(price-price_reduction));
    }
    //5
    static void DistanceBtwTwoPoints(int x1,int x2,int y1, int y2){
        double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}
