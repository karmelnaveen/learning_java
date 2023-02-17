package code;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,21,3415,51,-453,1051,-43,123,503};
        int target = 23;//-43;
        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch2(arr,target));
        System.out.println(linearSearch3(arr,target));
    }
    //Return the index of target
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //Return the target
    static int linearSearch2(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1; //There is a edge case what if the target is -1 .?
    }

    //Return either true/false; the arr contains the target or not
    static boolean linearSearch3(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

}
