package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subsetSum1 {
    public static void solve(int[] arr, int n, int idx, int sum, List<Integer> result){
        if(idx == n){
            result.add(sum);
            return ;
        }

        //pick element
        solve(arr,n,idx+1,sum+arr[idx], result);

//        not pick element
        solve(arr,n,idx+1,sum,result);
    }
    public static List<Integer>subsetSum(int[] arr, int n){
        List<Integer> result = new ArrayList<>();
        solve(arr,n,0,0,result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> ans = subsetSum(arr,arr.length);
        Collections.sort(ans);
        System.out.println(ans);

    }
}
