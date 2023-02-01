package Array_Assignments;

import java.util.Arrays;
//2.Concatenation of Array
public class easy_2 {
    public static void main(String[] args) {
//        Input: nums = [1,3,2,1]
//        Output: [1,3,2,1,1,3,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//        - ans = [1,3,2,1,1,3,2,1]
        int[] nums = {1,3,2,1};
        Concatenation(nums);
    }
    static void Concatenation(int[] nums){
        System.out.println(Arrays.toString(nums));
        int[] ans = new int[2*(nums.length)];
        int n = nums.length;
        for(int i = 0;i< n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
