package Array_Assignments;

import java.util.Arrays;

//1304. Find N Unique Integers Sum up to Zero
public class easy_21 {
    public static void main(String[] args) {
        int n = 100;
        int d = - n/2;
        int[] arr = new int[n];
        if(n %2 == 0){
            for(int i = 0;i<arr.length;i++){
                if(d != 0 ){
                    arr[i] = d;
                    d++;
                }else{
                    arr[i] = d+1;
                    d +=2;
                }

            }
        }else {
            for(int i = 0;i<arr.length;i++){
                    arr[i] = d;
                    d++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
