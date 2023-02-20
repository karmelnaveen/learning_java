package Array_Assignments;

//832. Flipping an Image
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

import java.util.Arrays;

public class easy_13 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int n = image.length - 1;
        int[][] reversed = new int[image.length][image.length];
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=n;j++){
                reversed[i][j] = image[i][n-j];
            }
        }
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------Original-------");
        for (int i = 0; i < reversed.length; i++){
            for (int j = 0; j < reversed[i].length; j++){
                System.out.print(reversed[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------Reversed-------");
        int[][] inverted = new int[image.length][image.length];
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=n;j++){
                if(reversed[i][j] == 0){
                    inverted[i][j] = 1;
                } else if (reversed[i][j] == 1) {
                    inverted[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < inverted.length; i++){
            for (int j = 0; j < inverted[i].length; j++){
                System.out.print(inverted[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------Inverted-------");

    }

}
