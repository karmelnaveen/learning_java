package assignments;
//1295. Find Numbers with Even Number of Digits
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation:
//12 contains 2 digits (even number of digits).
//345 contains 3 digits (odd number of digits).
//2 contains 1 digit (odd number of digits).
//6 contains 1 digit (odd number of digits).
//7896 contains 4 digits (even number of digits).
//Therefore only 12 and 7896 contain an even number of digits.
public class evenDigits {
    public static void main(String[] args) {
        //int[] nums = {12,345,2,6,7896};
        int[] nums = {555,901,482,1771};
        int ans = digits(nums);
        System.out.println(ans);
    }
    static int digits(int[] arr){
        int count = 0;
        for (int element: arr
             ) {
            var length = 0;
            if(element == 0){
                length = 1;
            }
            if(element < 0){
                element = element*(-1);
            }
            length = numberOfDigits(element);
            if(length%2 == 0){
                count++;
            }
        }
        return count;
    }

    static int numberOfDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
        //U could use (int)(Math.log10(n)+1)
    }
}
