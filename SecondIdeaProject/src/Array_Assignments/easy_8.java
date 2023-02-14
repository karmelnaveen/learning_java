package Array_Assignments;

//1365. How Many Numbers Are Smaller Than the Current Number

//Input: nums = [8,1,2,2,3]
//        Output: [4,0,1,1,3]
//        Explanation:
//        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//        For nums[1]=1 does not exist any smaller number than it.
//        For nums[2]=2 there exist one smaller number than it (1).
//        For nums[3]=2 there exist one smaller number than it (1).
//        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
public class easy_8 {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7}; //6,5,4,8 //8,1,2,2,3 //7,7,7,7
        //ArrayList<Integer> ans =  new ArrayList<>(nums.length); //Initially tried with arraylist but can be solved with array itself.
        int[] ans =new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int total = 0;
            //System.out.print(nums[i]+"-------");
            for(int j = 0;j<nums.length;j++){
                //System.out.print(nums[j]+"\t");
                if(nums[j] < nums[i] && nums[i] != nums[j]){
                    total+=1;
                }
            }
            ans[i] = total;
        }
        System.out.println(ans);
    }
}
