package Searching;
//744. Find Smallest Letter Greater Than Target
public class Smallest_char {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        char ans =  Smallest_char(letters, target);
        System.out.println(ans);
    }
    //smallest character greater than target
    public static char Smallest_char(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;
        if(target >= arr[end]){
            return arr[0];
        }
        while(start <= end){
            int middle = start + (end - start)/2;
            if(target < arr[middle]){
                end = middle - 1;
            }else { //This else condition handles both > and also = scenario
                start = middle + 1;
            }
        }
        return arr[start];// % arr.length
    }
}
