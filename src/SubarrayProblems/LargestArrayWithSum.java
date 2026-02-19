package SubarrayProblems;

public class LargestArrayWithSum {
    public static int solve(int[] arr, int k){
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        while(r<arr.length){
            sum = sum + arr[r];
            if(sum > k){
                sum = sum - arr[l];
                l++;
            }
            if(sum <= k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r = r + 1;
        }
        return maxLen;
    }
    public static void main(String[] args) {
//        Largest subarray with sum <= k
        int[] arr = {1, 2, 3, 4, 5};
        int k = 7;

        int result = solve(arr, k);

        System.out.println("Length of largest subarray with sum <= " + k + " is: " + result);

    }
}
