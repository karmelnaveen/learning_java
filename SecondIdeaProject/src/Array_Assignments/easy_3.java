package Array_Assignments;

import java.util.Arrays;
//Running Sum of 1d Array
public class easy_3 {
    public static void main(String[] args) {
//        Input: nums = [1,1,1,1,1]
//        Output: [1,2,3,4,5]
        int[] nums = {3,1,2,10,1};
        int[] ans = new int[nums.length];
        int prev = 0;
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
            ans[i]=prev+nums[i];
            prev+=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
