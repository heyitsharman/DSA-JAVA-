package Arrays;

public class LeetcodeProblem268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        int n = nums.length;
        int actualSum = n*(n+1)/2;
        return actualSum - sum;
    }
}
