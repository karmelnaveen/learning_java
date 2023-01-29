package Arrays;

public class max_arr {
    public static void main(String[] args) {
        int[] arr = {12,124,41568,6578,1214,999,321};
        System.out.println("The maximum value in the array is :"+Max(arr));
        System.out.println("The maximum value in the array in the range 4 & 6 is :"+MaxInRange(arr,4,6));
    }
    static int Max(int[] arr){
        if(arr.length == 0){
            return -1; //edge cases
        }
        int max_value = 0;
        for(int i = 0;i<arr.length ;i++){
            if(arr[i]>max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }

    static int MaxInRange(int[] arr, int index_1,int index_2){
        if(arr.length == 0){
            return -1; //edge cases
        }
        int max_value = 0;
        for(int i = index_1;i<index_2 ;i++){
            if(arr[i]>max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }
}
