package HashMap;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int curr = map.getOrDefault(nums[i], 0);
            count += curr;
            map.put(nums[i],curr+1);
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
