package Methods;

import java.util.Scanner;

public class methods_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial :");
        int num = in.nextInt();
        System.out.println("The factorial of "+num+" is "+Factorial(num));
    }
    static int Factorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        int factorial = 1;
        for(int i = 1;i<=number; i++){
            factorial*=i;
        }
        return factorial;
    }
}
