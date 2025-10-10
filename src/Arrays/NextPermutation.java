package Arrays;


import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] arr){
        int n = arr.length;
        int i= n-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;
            while(arr[j] <= arr[i]){
                j--;
            }
            swap(arr,i,j);
        }

        reverse(arr,i+1,arr.length-1);
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
