package Searching;

import java.lang.reflect.AnnotatedArrayType;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums  = {-122,-34,-5,0,23,32,49,68,120,199,288,365,444,578,666,773,875,999,1010};//Consider this an infinite array for argument’s sake
        int target = 120;
        //Sorted arr thus Binary search (ASC)
        //The only issue is we don't know the last index.
        //Thus, we are trying to find the range in which target is placed and then apply
        //Binary Search
        int ans = Ans(nums, target);
        System.out.println("The index is :"+ans);
    }
    static int Ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        if(target < arr[start]){
            //Not found
            return -1;
        }
        while(target > arr[end] ){
            int temp = end + 1;
            //Increase the range exponentially
            //end = end + sizeOfBoxValue*2 (Initially the size was 2)
            //end - start + 1 gives the size of the box --->size of the box = end - (start - 1)
            end = end + (end - start +1) * 2;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    public static int BinarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int middle = start + (end - start)/2; //You could also use start-end / 2 but that may cause errors in large arrays: int datatype max limit issue
            if(target < arr[middle]){
                //left half
                end = middle -1;
            }else if(target > arr[middle]){
                //right half
                start = middle +1;
            }else{
                //ans
                return middle;
            }
        }
        //Not found
        return -1;
    }
}
