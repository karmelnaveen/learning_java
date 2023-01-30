package Methods;

import java.util.Scanner;

public class method_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find whether it is palindrome :");
        int num = in.nextInt();
        isPalindrome(num);
    }
    static void isPalindrome(int number){
        int original = number;
        int reversed = 0;
        while (number > 0){
            int rem = number%10;
            reversed = reversed * 10 + rem;
            number = number/10;
        }
        if(original == reversed){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("It is not palindrome");
        }
    }
}
