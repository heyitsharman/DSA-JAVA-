package Arrays;

import java.util.ArrayList;


public class LeetcodeProblem283 {
    public static void moveZeros(int[] nums){
//        Brute force
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]!=0){
//                arr.add(nums[i]);
//            }
//        }
//        for(int i=0; i<arr.size(); i++){
//            nums[i] = arr.get(i);
//        }
//        for(int i=arr.size(); i<nums.length; i++){
//            nums[i]=0;
//        }


//        Optimal approach (2 pointers approach)
//        j keeps track of index of first 0 element
//        in a loop if some element is non zero swap it with jth index and increment j

        int j = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){

                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1; i<nums.length; i++){
            if(nums[i]!=0){
                swap(nums, i,j);
                j++;
            }
        }

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeros(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
