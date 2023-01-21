package com.assingments;

import java.util.Scanner;

// LCM & HCF
public class flow_of_program_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        LCM(num1, num2);
        HCF(num1, num2);
    }
    static void LCM(int num1, int num2){
        //Maximum of two number to lcm
        int lcm = Math.max(num1, num2);
        while(true){
            if(lcm%num1 == 0 && lcm%num2 == 0){
                System.out.println("The LCM of "+num1+" and "+num2+" is:"+lcm);
                break;
            }
            lcm++;
        }
    }
    static void HCF(int num1, int num2){
        int gcd = 1;
        for(int i = 1; i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0 ){
                gcd = i;
            }
        }
        System.out.println("The HCF of "+num1+" and "+num2+" is:"+gcd);
    }

}
