package Array_Assignments;

import java.util.ArrayList;
import java.util.Arrays;

//66. Plus One
public class easy_26 {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int length = digits.length;
        for(int i = length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                break;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [length+1];
        newNumber[0] = 1;

        System.out.println(Arrays.toString(newNumber));
    }
}
