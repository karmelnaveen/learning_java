package Array_Assignments;

import java.util.Arrays;
//1854. Maximum Population Year
//Input: logs = [[1993,1999],[2000,2010]]
//Output: 1993
//Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
public class easy_19 {
    public static void main(String[] args) {
        int ans = -1;
        int result = 0;
        //int[][] logs= {{1993,1999},{2000,2010}};
        //[1950,1961],[1960,1971],[1970,1981]
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        int[] arr = new int[101];
        for(int i = 0;i<logs.length;i++){
            for(int j = logs[i][0];j<logs[i][1];j++){
                arr[j - 1950] += 1;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
                result = i+1950;
            }
        }
        System.out.println(result);

    }
}
