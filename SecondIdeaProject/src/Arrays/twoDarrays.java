package Arrays;

import java.util.Scanner;

public class twoDarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr_2d = new int[3][2];

        for(int i =0;i<arr_2d.length;i++){//for each row
            for(int j=0;j<arr_2d[i].length;j++){//for each column
                System.out.print("Enter a number :");
                arr_2d[i][j] = input.nextInt();
            }
        }

        for(int i =0;i<arr_2d.length;i++){//for each row
            for(int j=0;j<arr_2d[i].length;j++){//for each column
                System.out.print(arr_2d[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
