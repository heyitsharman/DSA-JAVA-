package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void generateSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        generateSubsets(index+1, nums, ds, result);
        ds.remove(ds.size()-1);
        generateSubsets(index+1, nums, ds, result);
    }
    public static List<List<Integer>> power(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<>(), list);
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = power(nums);
        System.out.println(subsets);

    }
}
