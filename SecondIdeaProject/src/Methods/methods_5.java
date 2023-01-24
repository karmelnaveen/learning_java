package Methods;

import java.util.Scanner;

//Define a method to find out if a number is prime or not.
//Write a program that will ask the user to enter his/her marks (out of 100).
//Define a method that will display grades according to the marks entered as below:
public class methods_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find whether its prime or not :");
        int num = in.nextInt();
        isPrime(num);
    }
    static void isPrime(int num){
        if(num == 0){
            System.out.println("Enter a number above 0");
            return;
        }
        if(num == 1){
            System.out.println(num+" is Neither prime nor composite...");
            return;
        }
        for(int i = 2;i<num;i++){
            if(num%i == 0){
                System.out.println(num+" is not Prime");
                return;
            }
        }
        System.out.println(num+" is a prime Number");
    }
}
