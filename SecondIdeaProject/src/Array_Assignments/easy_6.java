package Array_Assignments;

import java.util.ArrayList;
import java.util.List;
//1431. Kids With the Greatest Number of Candies
//Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]
//        Explanation: If you give all extraCandies to:
//        - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//        - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//        - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//        - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//        - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
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
