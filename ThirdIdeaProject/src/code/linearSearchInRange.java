package code;

public class linearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,21,3415,51,-453,1051,-43,123,503};
        int target = -453;//-43;
        //Here we can search in a particular range of the array
        int start = 2;
        int end = 6;
        System.out.println(linearSearch(arr,target,start,end));
    }
    //Return the index of target
    static int linearSearch(int[] arr,int target,int start,int end){
        if (arr.length == 0){
            return -1;
        }
        for(int i = start;i<=end;i++){//Including the end too
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
