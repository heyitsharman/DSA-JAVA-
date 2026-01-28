package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CombinationSum2 {
    public static void solve(int[] arr, int target, int idx, List<Integer> ds, List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i < arr.length; i++){
            if(i>idx && arr[i] == arr[i-1]) {
                continue;
            }
            if(arr[i]> target){
                break;
            }
            ds.add(arr[i]);
            solve(arr,target-arr[i],i+1,ds,list);
            ds.remove(ds.size()-1);

        }
    }
    public static List<List<Integer>> answer(int[] arr, int k){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        solve(arr,k, 0,new ArrayList<>(), list);
        return list;
    }
    public static void main(String[] args) {
        int[] arr= {1,1,1,2,2};
        List<List<Integer>> ans = answer(arr,4);
        System.out.println(ans);
    }
}
