package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class printPermatations {
    public void permute(int[] nums, List<Integer> ds, boolean[] freq, List<List<Integer>> res){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                permute(nums,ds,freq,res);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permute(nums,list,freq,res);
        return res;
    }

}
