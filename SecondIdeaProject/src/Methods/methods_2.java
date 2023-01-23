package Methods;

import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class methods_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find whether it is even or odd : ");
        int number = in.nextInt();
        if(isOdd(number)){
            System.out.println("The given number is odd");
        }else {
            System.out.println("The given number is even");
        }
    }
    static boolean isOdd(int number){
        return number % 2 != 0;
    }
}
