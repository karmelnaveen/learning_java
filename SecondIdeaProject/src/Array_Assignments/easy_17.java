package Array_Assignments;

import java.util.Arrays;

//867. Transpose Matrix
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
public class easy_17 {
    public static void main(String[] args) {
        //int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //[[1,2,3],[4,5,6]]
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] new_arr = new int[arr[0].length][arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                    System.out.println(arr[i][j]);
                    new_arr[j][i] = arr[i][j];

            }
        }
        for(int i = 0;i<new_arr.length;i++){
            System.out.println(Arrays.toString(new_arr[i]));
        }
    }
}
