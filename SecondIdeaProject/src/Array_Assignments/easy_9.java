package Array_Assignments;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//1389. Create Target Array in the Given Order
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//        Output: [0,4,1,3,2]
//        Explanation:
//        nums       index     target
//        0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]
public class easy_9 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = new int[nums.length];
        //Using Array list because it's easier to insert values at specified places
        ArrayList<Integer> target = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        //then looping through arraylist and mapping it to an array.
        for(int i = 0;i<nums.length;i++ ){
            ans[i] = target.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
