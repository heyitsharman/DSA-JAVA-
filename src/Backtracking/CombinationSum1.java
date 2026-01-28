package Backtracking;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void solve(int[] arr, int target, int idx, List<Integer> ds, List<List<Integer>> result){

        if(idx == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[idx] <= target){
            ds.add(arr[idx]);
            solve(arr,target -arr[idx], idx,ds,result);
            ds.remove(ds.size()-1);
        }
        solve(arr, target, idx+1,ds,result);
    }

    public static List<List<Integer>> answer(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(candidates);
        solve(candidates,target,0,new ArrayList<>(), result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,6,7};
        List<List<Integer>> ans = answer(arr,7);
        System.out.println(ans);
    }
}
