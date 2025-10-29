package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class one {
    public static void solve(int[] arr, int target, List<Integer> list){
        if(target == 0){
            System.out.println(list);
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
            solve(arr,target-arr[i],list);
            list.remove(list.size()-1);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 3;
        List<Integer> list = new ArrayList<>();
        solve(arr,target,list);
    }
}
