package Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-122,-87,-13,0,11,23,47,55,345,999};
        int target = 55;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    public static int OrderAgnosticBS(int[] arr, int target) {
        boolean isAsc = arr[0] < arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2; //You could also use start-end / 2 but that may cause errors in large arrays: int datatype max limit issue
            if (target == arr[middle]) {
                return middle;
            }
            if (isAsc) { //If ascending
                if (target < arr[middle]) {
                    //left half
                    end = middle - 1;
                } else {
                    //right half
                    start = middle + 1;
                }
            } else { //If descending
                if (target < arr[middle]) {
                    //left half
                    end = middle - 1;
                } else {
                    //right half
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
