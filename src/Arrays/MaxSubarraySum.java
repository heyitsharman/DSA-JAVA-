package Arrays;

public class MaxSubarraySum {
    public static int BruteForce(int[] arr, int n){
//        time complexity O(n^3)
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = 0;
                for(int k=i; k<j; k++){
                    sum += arr[k];
                }
                maxSum= Math.max(maxSum,sum);
            }
        }

        return maxSum;
    }
    public static int betterSol(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum,sum);

            }
        }
        return maxSum;
    }
    public static int KadaneAlgo(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

//    to print subarray
    public static void PrintMaxSubarray(int[] arr , int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int n = arr.length;
//        System.out.println(BruteForce(arr,n));
//        System.out.println(betterSol(arr,n));
        System.out.println(KadaneAlgo(arr,n));


    }
}
