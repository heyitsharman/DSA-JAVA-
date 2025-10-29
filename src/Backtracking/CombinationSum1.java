package Backtracking;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void solve(int[] arr, int target, int idx, List<Integer> ds, List<List<Integer>> result){

        if(target==0){
            result.add(new ArrayList<>(ds));
            return;
        }


        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i-1]==arr[i]) continue;
            if(arr[i]> target) break;
            ds.add(arr[i]);
            solve(arr,target-arr[i],i+1,ds,result);
            ds.remove(ds.size()-1);
        }

    }

    public static List<List<Integer>> answer(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,0,new ArrayList<>(), result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,6,7};
        List<List<Integer>> ans = answer(arr,7);
        System.out.println(ans);
    }
}
