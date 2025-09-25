package Arrays;

public class BuySellStock {
    public static int BruteSol(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int profit = 0;
            for(int j=i+1; j<arr.length; j++){
                profit = arr[j] - arr[i];
                max = Math.max(max,profit);
            }

        }
        return max;
    }
    public static int OptimizedSol(int[] arr){
        int mini = arr[0];
        int profit = 0;
        for(int i=1; i<arr.length; i++){
            int cost = arr[i] - mini;
             profit = Math.max(profit,cost);
            mini = Math.min(mini,arr[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
//        System.out.println(BruteSol(arr));
        System.out.println(OptimizedSol(arr));
    }
}
