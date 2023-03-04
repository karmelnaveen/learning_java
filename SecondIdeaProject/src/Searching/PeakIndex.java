package Searching;
//852. Peak Index in a Mountain Array
public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,10,15,2};//0,10,5,2 --  0,2,1,0
        //One side is asc and another is desc
        //Need to find the peak (The Largest value)
        //In either asc or desc no duplicate will be there, but duplicate will be there in whole arr
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //You are in the descending side of the mountain
                end = mid;
            }else {
                //You are in the ascending side of the mountain
                start = mid+1; //we know the next value is greater than mid, thus we are staring from there
            }
        }
        return start;//or end,it doesn't matter. Both will be equal while reaching the peak;
    }
}
