package code;

import java.util.Arrays;

public class linearSearchIn2Darr {
    public static void main(String[] args) {
        int[][] arr ={
                {12,145,73,-99},
                {45,-673,1135,17},
                {23,67},
                {5245,677,344},
                {99}
        };
        int target = 99;
        System.out.println(Arrays.toString(linearSearch(arr,target)));
        System.out.println("The max value is :"+max(arr));
        System.out.println("The min value is :"+min(arr));
    }
    static int[] linearSearch(int[][] arr, int target){
        for(int row = 0;row<arr.length;row++){
            for(int column = 0;column< arr[row].length;column++){
                if(arr[row][column] == target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0;row<arr.length;row++){
            for(int column = 0;column< arr[row].length;column++){
                if(arr[row][column] > max){
                    max = arr[row][column];
                }
            }
        }
        return max;
    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row = 0;row<arr.length;row++){
            for(int column = 0;column< arr[row].length;column++){
                if(arr[row][column] < min){
                    min = arr[row][column];
                }
            }
        }
        return min;
    }
}
