package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-122,-87,-13,0,11,23,47,55,345,999};
        int target = 55;
        int ans = BinarySearch(arr ,target);
        System.out.println(ans);
    }
    //Index of the target
    public static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
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
