package Arrays;

import java.util.Arrays;

public class swap_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,6423,12344,2131};
        // I am going to swap 4 & 7
        System.out.println("Un-swapped array :"+ Arrays.toString(arr));
        swap(arr , 4, 7);
        System.out.println("Swapped array :"+ Arrays.toString(arr));
    }
    static void swap(int[] arr,int index_1,int index_2){
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;
    }
}
