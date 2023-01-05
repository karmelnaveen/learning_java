package com.karmel;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting calculator...");
        System.out.println("Click x or X to end the program");
        while(true){
            System.out.print("Enter a operator (+ , - , * , / , %) :");
            char operator = input.next().trim().charAt(0);
            int ans = 0;
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.println("Enter two numbers");
                System.out.print("Number 1 :");
                int num1 = input.nextInt();
                System.out.print("Number 2 :");
                int num2 = input.nextInt();
                if(operator == '+'){
                    ans = num1+num2;
                }
                if(operator == '-'){
                    ans = num1+num2;
                }
                if(operator == '*'){
                    ans = num1*num2;
                }
                if(operator == '/'){
                    if(num2 != 0){
                        ans = num1/num2;
                    }else {
                        System.out.println("Can't divide by 0");
                    }
                }
                if(operator == '%'){
                    ans = num1%num2;
                }
                System.out.println(ans);
            }else if(operator == 'x' || operator == 'X'){
                System.out.println("Ending the program...");
                break;
            }else{
                System.out.println("Invalid Operator, choose one from the following (+,-,*,/,%)");
            }
        }

    }
}
