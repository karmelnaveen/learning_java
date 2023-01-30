package Methods;

import java.util.Scanner;

public class methods_8 {
    public static void main(String[] args) {
        // 11 most questions are already written as methods
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find whether they are Pythagorean triplet,");
        System.out.print("Number 1 :");
        int num1 = in.nextInt();
        System.out.print("Number 2 :");
        int num2 = in.nextInt();
        System.out.print("Number 3 :");
        int num3 = in.nextInt();
        isPythagorean(num1,num2,num3);
    }
    static boolean isPythagorean(int num1,int num2,int num3){
        //Condition : the square of first two numbers is equal to third number
        double group1 = Math.pow(num1,2) + Math.pow(num2,2);
        double group2 = Math.pow(num2,2) + Math.pow(num3,2);
        double group3 = Math.pow(num3,2) + Math.pow(num1,2);
        if(group1 == Math.pow(num3,2)){
            System.out.println("Yes, this is pythagorean triplet");
            return true;
        }
        if(group2 == Math.pow(num1,2)){
            System.out.println("Yes, this is pythagorean triplet");
            return true;
        }
        if(group3 == Math.pow(num2,2)){
            System.out.println("Yes, this is pythagorean triplet");
            return true;
        }
        System.out.println("No, this is not a pythagorean triplet");
        return false;
    }
}
