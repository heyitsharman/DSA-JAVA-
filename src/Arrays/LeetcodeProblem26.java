package Arrays;

public class LeetcodeProblem26 {
    public static int removeDuplicates(int[] nums) {

        int j = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }

        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int result = removeDuplicates(arr);
        System.out.println(result);
        }
}
