package Arrays;

public class MaximumProductSubarray
{
    public int maxProduct(int[] nums) {
        int maxi = nums[0];
        int mini = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = maxi;
                maxi = mini;
                mini = temp;

            }
            maxi = Math.max(num, num * maxi);
            mini = Math.min(num, num * mini);
            res = Math.max(res, maxi);
        }
        return res;
    }
}
