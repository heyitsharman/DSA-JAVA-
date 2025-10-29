package Backtracking;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;



public class possibleSubsetsSum {
    public static void solve(int[] arr, int sum, int idx,List<Integer> ds){
        if(idx == arr.length){
            ds.add(sum);
            return;
        }

        solve(arr,sum+arr[idx],idx+1,ds);


        solve(arr,sum,idx+1,ds);
    }
    public static List<Integer> sumOfSubsets(int[] arr){
        List<Integer> ans = new ArrayList<>();
//        Arrays.sort(arr);
        solve(arr,0,0,ans);
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        List<Integer> subsets = sumOfSubsets(nums);
        System.out.println(subsets);
    }
}
