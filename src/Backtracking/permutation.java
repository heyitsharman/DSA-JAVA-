package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    public static void solve(int[] nums,List<Integer> ds, boolean[] freq,List<List<Integer>> res ){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                solve(nums,ds,freq,res);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        solve(nums,list,freq,res);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = permute(arr);
        System.out.println(ans);


    }
}
