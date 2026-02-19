package SubarrayProblems;

public class Leetcode643 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int wsum = 0;
            for(int i=0; i<k; i++){
                wsum += nums[i];
            }
            int maxSum = wsum;
            int sum = wsum;
            for(int i=k; i<nums.length; i++){
                wsum = wsum - nums[i-k];
                wsum += nums[i];
                if(wsum > maxSum){
                    maxSum = wsum;
                }
            }
            return (double) maxSum / k;
        }
    }
}
