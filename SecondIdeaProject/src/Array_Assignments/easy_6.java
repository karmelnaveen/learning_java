package Array_Assignments;

import java.util.ArrayList;
import java.util.List;
//1431. Kids With the Greatest Number of Candies
public class easy_6 {
    public static void main(String[] args) {
        int[] candies ={12,1,12};
        int extra_candies = 10;
        int max = candies[0];
        for(int i =0;i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0;i<candies.length;i++){
            if(candies[i]+extra_candies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        System.out.println(ans);
    }
}
