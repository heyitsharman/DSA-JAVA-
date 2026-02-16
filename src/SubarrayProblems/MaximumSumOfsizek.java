package SubarrayProblems;

public class MaximumSumOfsizek {
    public static int solve(int[] nums, int k){
//        int maxSum = Integer.MIN_VALUE;
//
//        for(int i=0; i<=nums.length-k; i++){
//            int currSum = 0;
//            for(int j=i ; j<i+k; j++){
//                currSum += nums[j];
//            }
//            maxSum = Math.max(currSum,maxSum);
//        }
//        return maxSum;

        int wSum = 0;
        for(int i=0; i<k; i++){
            wSum = wSum + nums[i];
        }
        int maxSum = wSum;
        for(int i=k; i<nums.length; i++){

            wSum = wSum - nums[i-k];

            wSum += nums[i];

            maxSum = Math.max(maxSum,wSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int res = solve(arr,3);
        System.out.println(res);
    }
}
