package Searching;
//33. Search in Rotated Sorted Array
public class RotatedArr {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = Answer(nums,target);
        System.out.println(ans);
    }

    public static int Answer(int[] arr,int target){
        int pivot = Pivot(arr);
        if(pivot == -1){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        }

        //Decide where to search on basis of starting element
        if(target > arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }else{
            return BinarySearch(arr,target,pivot+1,arr.length-1);
        }
    }
    //1. Need to find the pivot
    //2. Then need to search in 0 to pivot if not found then in pivot to end
    //The most optimized is recursion but will try that later
    //ascending array and no duplicates in constraints
    public static int Pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            //if mid is > than mid+1 --> pivot : mid < end is added to avoid array index out of bound
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //if mid is < than mid -1 --> pivot : mid > start is added to avoid array index out of bound
            if(mid > start && arr[mid] > arr[mid+1]){
                return mid -1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } //if mid is smaller than start - we are in other side -- > end = mid - 1
            else {
                start = mid + 1;
            }//if mid is greater than start - we are in 1st asc side --> start = mid +1
        }
        return -1;
    }
    public static int BinarySearch(int[] arr,int target, int start,int end){
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
