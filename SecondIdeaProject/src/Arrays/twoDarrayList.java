package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class twoDarrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Initialization
        for(int i = 0;i<3; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i<3 ; i++){
            System.out.print("Enter a number :");
            list.get(i).add(in.nextInt());
        }

        System.out.println(list);

    }
}
