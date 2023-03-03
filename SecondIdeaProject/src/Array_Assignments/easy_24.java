package Array_Assignments;

import java.util.Arrays;

//566. Reshape the Matrix
public class easy_24 {
    public static void main(String[] args) {
//        Input: mat = [[1,2],[3,4]], r = 1, c = 4
//        Output: [[1,2,3,4]]
        int[][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 2;
        int m = mat.length;
        int n = mat[0].length;
        int ans_row = 0;
        int ans_col = 0;
        if (m*n == r*c){
            System.out.println("Same dimensions");
            int[][] ans = new int[r][c];
            for(int i =0;i<m;i++){
                for(int j = 0;j<n;j++){
                    ans[ans_row][ans_col] = mat[i][j];
                    ans_col++;
                    if(ans_col == c){
                        ans_col = 0;
                        ans_row++;
                    }
                }
            }
        }
        else{
            System.out.println("Different dimensions");
        }
    }
}
