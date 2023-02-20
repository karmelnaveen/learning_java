package Array_Assignments;
//1572. Matrix Diagonal Sum
//Input: mat = [[1,2,3],
//[4,5,6],
//[7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
public class easy_15 {
    public static void main(String[] args) {
//        int[][] mat = {{1,2,3},
//                        {4,5,6},
//                        {7,8,9}};
        int[][] mat = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};
        int sum = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(i == j){
                    sum+=mat[i][j];
                }
                else if (i+j == mat.length - 1){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
