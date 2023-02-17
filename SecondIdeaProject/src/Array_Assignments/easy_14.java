package Array_Assignments;

import java.util.Arrays;

//1252. Cells with Odd Values in a Matrix
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
public class easy_14 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] matrix = new int[m][n];
        int[][] indices = {{0,1},{1,1}};
        for(int i = 0;i<indices.length;i++){
            var row = indices[i][0];
            var column = indices[i][1];
            for(int r = 0; r<n;r++){
                matrix[row][r]++;
            }
            for(int c = 0; c<m;c++){
                matrix[c][column]++;
            }
        }
        int counter = 0;
        for(int a = 0;a<m;a++){
            for(int b =0;b<n;b++){
                if(matrix[a][b] % 2 !=0){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
