package Array_Assignments;

import java.util.Arrays;

//1886. Determine Whether Matrix Can Be Obtained By Rotation
public class easy_20 {
    public static void main(String[] args) {
        //mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
        //[0,0,0],[0,1,0],[1,1,1]
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] temp = new int[mat.length][mat.length];
        int[][] target = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] answer = rotate90Degree(mat);

        for(int count = 1;count<=4;count++){
            if(isEqual(mat,target)){
                System.out.println("true");
                break;
            }
            mat = rotate90Degree(mat);
        }
        System.out.println("false");

    }
    public static boolean isEqual(int[][] arr1, int[][] arr2){
        if(arr1.length != arr2.length) return false;
        if(arr1[0].length != arr2[0].length) return false;

        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                if(arr1[i][j] != arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] rotate90Degree(int[][] arr) {
        //transpose
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                //System.out.println(mat[i][j]);
                temp[i][j] = arr[j][i];
            }
        }
        //reverse the rows
        int[][] rotated = new int[arr.length][arr[0].length];
        for(int i = 0;i<temp.length;i++){
            for(int j = 0;j<temp.length;j++){
                rotated[i][j] = temp[i][temp.length-j-1];
            }
        }
        return rotated;
    }
}
