package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeProblem560 {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }

        return count;
    }
    public int subarray(int[] nums, int k) {

        int count = 0;
        int preSum = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for(int i=0; i<nums.length; i++){
            preSum += nums[i];

            int remove = preSum - k;
            count += mpp.getOrDefault(remove,0);
            mpp.put(preSum, mpp.getOrDefault(preSum,0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subarraySum(arr,3));
    }
}
