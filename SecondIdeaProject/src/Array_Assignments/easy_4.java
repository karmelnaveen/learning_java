package Array_Assignments;

//Richest Customer Wealth
public class easy_4 {
    public static void main(String[] args) {
        int [][] arr = {{2,8,7},{7,1,3},{1,9,5}};
        int wealthiest = Integer.MIN_VALUE;
        int total_wealth = 0;
        for (int customer = 0;customer<arr.length;customer++){
            for(int account = 0;account<arr[customer].length;account++){
                total_wealth+= arr[customer][account];
            }
            if(total_wealth > wealthiest){
                wealthiest = total_wealth;
            }
            total_wealth = 0;
        }
        System.out.println(wealthiest);
    }
}
