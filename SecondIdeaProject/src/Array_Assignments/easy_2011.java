package Array_Assignments;
//2011. Final Value of Variable After Performing Operations
public class easy_2011 {
    public static void main(String[] args) {
        String[] arr = {"X++","++X","--X","X--"};//"--X","X++","X++" //"X++","++X","--X","X--"
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals("X++") || arr[i].equals("++X")){
                ans +=1;
            }else{
                ans -=1;
            }
        }
        System.out.println(ans);
    }
}
