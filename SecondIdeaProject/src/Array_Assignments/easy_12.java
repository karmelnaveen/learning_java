package Array_Assignments;

import java.util.ArrayList;
import java.util.Arrays;

//1732. Find the Highest Altitude
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
public class easy_12 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};//-4,-3,-2,-1,4,3,2 //-5,1,5,0,-7
        int[] current_altitude = new int[gain.length];
        int starting = 0;
        for(int i = 0;i<gain.length;i++){
            starting+=gain[i];
            current_altitude[i] = starting;
        }
        int ans = Arrays.stream(current_altitude).max().getAsInt();
        if(ans < 0){
            System.out.println(0);
        }else{
            System.out.println(ans);
        }
    }
}
