package com.assingments;

import java.util.Scanner;
//        Find Ncr & Npr
public class conditional_loops_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To find Compound interest, Enter the following,");
        System.out.print("Principal Amount :");
        double principle = in.nextDouble();
        System.out.print("Rate of Interest :");
        double roi = in.nextDouble();
        System.out.print("Time in years :");
        double time = in.nextDouble();
        CompoundInterest(principle,roi,time);
        //Assume there is only 4 subjects
        System.out.println("To find average marks, Enter the following,");
        System.out.print("English :");
        double english = in.nextDouble();
        System.out.print("Tamil :");
        double tamil = in.nextDouble();
        System.out.print("Maths :");
        double maths = in.nextDouble();
        System.out.print("CS :");
        double cs = in.nextDouble();
        AverageMarks(english,tamil,maths,cs);
        System.out.println("Enter two number to find armstrong number between them");
        System.out.print("First :");
        int start = in.nextInt();
        System.out.print("Second :");
        int end = in.nextInt();
        for(int i = start;i<=end;i++){
            if(Armstrong(i)){
                System.out.print(i+"\t");
            }
        }
        System.out.print("Enter a number to find its ncr and npr, n =");
        int n = in.nextInt();
        System.out.print("r =");
        int r = in.nextInt();
        Ncr_Npr(n,r);
    }
    //11
    static void CompoundInterest(double principle,double roi,double time){
        System.out.println("The amount is "+(principle*Math.pow(1+(roi/100),time)));
    }
    //12
    static void AverageMarks(double english,double tamil,double maths,double cs){
        System.out.println("The average is "+((english+tamil+maths+cs)/4));
    }
    //13 is already done
    //14
    static boolean Armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int i = n%10;
            sum+=Math.pow(i,3);
            n = n/10;
        }
        return original == sum;
    }
    //15
    static void Ncr_Npr(int n,int r){
        System.out.println("The NCR is :"+((fact(n)) / (fact(r)*fact(n-r))));
        System.out.println("The NPR is :"+((fact(n)) / (fact(n-r))));
    }
    static int fact(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact*=fact*i;
        }
        return fact;
    }
}
