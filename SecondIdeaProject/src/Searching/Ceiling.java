package Searching;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-122,-87,-13,0,11,23,47,55,345,999};
        int target = -999;
        int ans = Ceiling(arr ,target);
        System.out.println(ans);
    }
    //Smallest number greater or equal to target
    public static int Ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }
        else if(target < arr[start]){
            return 0;
        }
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
        return start;
    }
}
