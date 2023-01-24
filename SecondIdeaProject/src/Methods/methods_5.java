package Methods;

import java.util.Scanner;

//7.Define a method to find out if a number is prime or not.
//8.Write a program that will ask the user to enter his/her marks (out of 100).
//Define a method that will display grades according to the marks entered as below:
public class methods_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find whether its prime or not :");
        int num = in.nextInt();
        isPrime(num);
        System.out.println("To find your grades enter your marks subject wise out of 100,");
        System.out.print("English :");
        double english = in.nextDouble();
        String score = Grade(english);
        System.out.println("You grade in english is "+score);
        System.out.print("Tamil :");
        double tamil = in.nextDouble();
        String score2 = Grade(tamil);
        System.out.println("You grade in tamil is "+score2);
        System.out.print("Maths :");
        double maths = in.nextDouble();
        String score3 = Grade(maths);
        System.out.println("You grade in maths is "+score3);
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
    static String Grade(double marks){
        if(marks >=91 && marks <= 100){
            return "AA";
        }
        if(marks >=81 && marks <= 90){
            return "AB";
        }
        if(marks >=71 && marks <= 80){
            return "BB";
        }

        if(marks >=61 && marks <= 70){
            return "BC";
        }
        if(marks >=51 && marks <= 60){
            return "CD";
        }
        if(marks >=41 && marks <= 50){
            return "DD";
        }
        if(marks <=40){
            return "Fail";
        }
        return "Enter a valid mark to get results";
    }
}
