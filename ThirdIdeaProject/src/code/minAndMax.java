package code;

public class minAndMax {
    public static void main(String[] args) {
        int[] arr = {1,21,3415,51,-453,1051,-43,123,503};

        int max = arr[0];
        System.out.println("The min is :"+min(arr)+" and the max is :"+max(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        for (int value:arr) {
            if(value < min){
                min = value;
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int value:arr) {
            if(value > max){
                max = value;
            }
        }
        return max;
    }
}
