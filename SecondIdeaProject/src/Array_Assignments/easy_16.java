package Array_Assignments;

// 1295. Find Numbers with Even Number of Digits
//Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore, only 12 and 7896 contain an even number of digits.
public class easy_16 {
    public static void main(String[] args) {
        int[] nums =  {555,901,482,1771}; //{12,345,2,6,7896};
        int count = 0;
        for(int i = 0 ;i<nums.length;i++){
            String str = Integer.toString(nums[i]);
            if(str.length() % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
