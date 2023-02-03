package Array_Assignments;

import java.util.Arrays;
//Shuffle the Array
public class easy_5 {
    public static void main(String[] args) {
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
        int[] nums = {1,1,2,2};
        int n = 2;
        int[] ans = new int[nums.length];
        int x = 0;
        for(int i =0;i<n;i++){
            //System.out.println(nums[i]);
            ans[x] = nums[i];
            ans[x+1] = nums[i+n];
            x=x+2;
        }
        System.out.println(Arrays.toString(ans));
    }
}
