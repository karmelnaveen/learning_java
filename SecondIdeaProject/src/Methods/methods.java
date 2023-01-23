package Methods;

import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To find the maximum & minimum of 3 numbers,");
        System.out.print("Enter first number :");
        int first = in.nextInt();
        System.out.print("Enter second number :");
        int second = in.nextInt();
        System.out.print("Enter third number :");
        int third = in.nextInt();
        int max = Maximum(first,second,third);
        int min = Minimum(first,second,third);
        System.out.println("The maximum value is "+max+" & minimum value is "+min);
    }
    static int Maximum(int a,int b,int c){
        int max = a;
        if(b>a){
            max = b;
        }
        if(c>a){
            max = c;
        }
        return max;
    }
    static int Minimum(int a,int b,int c){
        int min = a;
        if(b<a){
            min = b;
        }
        if(c<a){
            min = c;
        }
        return min;
    }
}
