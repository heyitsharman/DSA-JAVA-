package SubarrayProblems;

public class Leetcode1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int wSum = 0;
        int target = threshold * k;
        for(int i=0; i<k; i++){
            wSum = wSum + arr[i];
        }
        int count = 0;
        if(wSum >= target){
            count ++;
        }
        for(int i=k; i<arr.length; i++){
            wSum = wSum - arr[i-k];
            wSum = wSum + arr[i];
            if(wSum >= target){
                count++;
            }
        }
        return count;
    }
}
