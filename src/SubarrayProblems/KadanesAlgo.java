package SubarrayProblems;

public class KadanesAlgo {
    public static int solve(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int res = solve(arr);
        System.out.println(res);
    }
}
