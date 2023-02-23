package Array_Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//989. Add to Array-Form of Integer
//Use while loop till array_size > 0 || k > 0
//
//        Inside while :
//        2.1.Use If to check weather size > 0
//        2.1.1Add last element of array into k
//        2.1.2 decrease array_size by 1.
//        2.2.Add last element of K in your list
//        2.3 remove last element of k
//
//        IF REQUIRED reverse your list and return
public class easy_18 {
    public static void main(String[] args) {
        //I have gone with this method but not working for large k values, the constraints are long
        int[] num = {2,1,5};
        int k = 806;
//        StringBuilder string = new StringBuilder();
//        for(int i = 0;i<num.length;i++){
//            string.append(num[i]);
//        }
//        int new_total = Integer.parseInt(string.toString()) + k;
        List<Integer> ans = new ArrayList<Integer>(num.length);
//        String a = String.valueOf(new_total);
//        char[] b = a.toCharArray();
//        for(int i = 0;i<b.length;i++){
//            ans.add(Integer.parseInt(String.valueOf(b[i])));
//        }
//        System.out.println(ans);
        int n = num.length;
        while(n > 0 || k > 0 ){
            if(n > 0){
                k = k + num[n - 1];
                n -- ;
            }
            ans.add(k% 10);
            k = k/10;
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
