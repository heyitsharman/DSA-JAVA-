package Arrays;
import java.util.*;
public class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
//        Brute force solution
//        int n = nums.length;
//        Arrays.sort(nums);
//        int largest = nums[n-1];
//        int second = 0;
//        for(int i=n-2; i>=0; i--){
//            if(nums[i]!=largest){
//                second = nums[i];
//                return second;
//            }
//        }
//
//        return 0;

//        Optimal Approach
        int largest = nums[0];
        int Slargest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                Slargest= largest;
                largest=nums[i];
            }
            else if(nums[i] < largest && nums[i] > Slargest){
                Slargest = nums[i];
            }
        }

        return Slargest;



    }
    public static void main(String[] args) {
        int[] arr = {1,2,7,7,4};
        int res = secondLargestElement(arr);
        System.out.println(res);
    }
}
