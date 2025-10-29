package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        Arrays.fill(used,false);
        solve(arr,list,used);
    }
    public static void solve(int[]arr, List<Integer> list, boolean[] used){
        if(list.size()== arr.length){
            System.out.println(list);
            return ;
        }

        for(int i=0; i<arr.length; i++){
            if(used[i]==true){
                continue;
            }
            list.add(arr[i]);
            used[i] = true;
            solve(arr,list,used);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}
