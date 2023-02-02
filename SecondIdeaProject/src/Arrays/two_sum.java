package Arrays;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        //[3,2,3]
        int[] nums = {2,5,5,11};
        int[] ans = new int[2];
        int target = 10;
        for(int i = 0;i<nums.length;i++){
            //System.out.println(nums[i]);
            for(int j = i+1;j<nums.length;j++){
                //System.out.println(nums[i]+"-"+nums[j]);
                if(nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                    System.out.println(Arrays.toString(ans));
                }
            }
        }
        //System.out.println(Arrays.toString(ans));
    }
//    [2,5,5,11]
//            10
//    output [1,1]
//    expected [1,2]
}
