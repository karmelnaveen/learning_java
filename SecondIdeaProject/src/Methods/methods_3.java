package Methods;

import java.util.Scanner;
//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class methods_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = in.nextInt();
        if(isEighteen(age)){
            System.out.println("You are allowed to vote. Make a correct decision");
        }else{
            System.out.println("You are not allowed to vote. Wait a few more years...");
        }
    }
    static boolean isEighteen(int age){
        return age >= 18;
    }
}
