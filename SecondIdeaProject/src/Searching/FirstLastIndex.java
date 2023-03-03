package Searching;

import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
public class FirstLastIndex {
    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target = 8;
        //expected ans = [3,4]
        int [] ans = {-1,-1};
        int first = Search(nums, target,true);
        int last = Search(nums,target,false);
        ans[0] = first;
        ans[1] = last;
        System.out.println(Arrays.toString(ans));
    }
    //First Instance
    static int Search(int[] nums,int target,boolean isFirstOccurence){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(isFirstOccurence){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
