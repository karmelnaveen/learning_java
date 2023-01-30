package Methods;

import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class methods_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a interval to find the prime numbers in between,");
        System.out.print("Starting :");
        int start = in.nextInt();
        System.out.print("Ending :");
        int end = in.nextInt();
        for(int i = start;i<=end; i++){
            if(primeNumbers(i)){
                System.out.print(i +"\t");
            }
        }
        System.out.println();
        System.out.print("Enter a number to find the sum of first n natural numbers :");
        int num = in.nextInt();
        nNumbers(num);
    }
    static boolean primeNumbers(int number){
        if(number == 0 || number == 1){
            System.out.println(number +" is neither a prime nor a composite number");
            return false;
        }if(number == 2 || number == 3){
            return true;
        }
        for(int i = 2;i<number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
    static void nNumbers(int n){
        System.out.println(n*(n+1)/2);
    }
}
