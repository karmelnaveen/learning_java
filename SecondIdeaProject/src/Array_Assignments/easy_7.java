package Array_Assignments;
//1512. Number of Good Pairs
public class easy_7 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+"----");
            for(int j = 1;j < nums.length - i;j++){
                System.out.print(nums[j+i]+"\t");
                if(nums[i]==nums[j+i] && nums[i]<=nums[j+i]){
                    ans = ans+1;
                }
            }
            System.out.println();
        }
        System.out.println("The number of good pairs are "+ans);
    }
}
