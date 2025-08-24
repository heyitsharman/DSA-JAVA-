package Arrays;

public class LargestElementInArray {
    public static int largestElement(int[] nums) {
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        int result = largestElement(arr);
        System.out.println(result);
    }
}
