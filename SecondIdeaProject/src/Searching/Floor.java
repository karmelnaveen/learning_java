package Searching;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-122,-87,-13,0,11,23,47,55,345,999};
        int target = -1000;
        int ans = Floor(arr ,target);
        System.out.println(ans);
    }
    //Largest number lesser or equal to target
    public static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return arr[end];
        }
        else if(target < arr[start]){
            return -1;
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
        return end;
    }
}
