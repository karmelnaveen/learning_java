package Array_Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//1380. Lucky Numbers in a Matrix
public class easy_23 {
    public static void main(String[] args) {
        //Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int m = matrix.length;
        int n =matrix[0].length;
        int[] row_min = new int[m];
        int[] column_max = new int[n];
        //Min in row
        for(int i =0;i<m;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                System.out.println(matrix[i][j]);
                min = Integer.min(min, matrix[i][j]);
            }
            row_min[i] = min;
        }
        System.out.println(Arrays.toString(row_min));
        //Max in column
        for(int i =0;i<n;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                System.out.println(matrix[j][i]);
                max = Integer.max(max, matrix[j][i]);
            }
            column_max[i] = max;
        }
        //Common in both
        ArrayList<Integer> ans =  new ArrayList<Integer>(row_min.length);
        System.out.println(Arrays.toString(column_max));
        for(int i = 0;i<row_min.length;i++){
            for (int j = 0;j<column_max.length;j++){
                if(row_min[i] == column_max[j]){
                    ans.add(row_min[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
