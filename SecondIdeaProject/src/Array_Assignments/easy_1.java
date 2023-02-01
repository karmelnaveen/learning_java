package Array_Assignments;

import java.util.Arrays;

//1.Build Array from Permutation
public class easy_1 {
    public static void main(String[] args) {
        int[] int_arr = {0,2,1,5,3,4};
        buildArray(int_arr);
    }
    static void buildArray(int[] int_arr){
        int[] new_arr = new int[int_arr.length];
        System.out.println(Arrays.toString(int_arr));
        for(int i = 0;i<int_arr.length;i++){
            new_arr[i] = int_arr[int_arr[i]];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
