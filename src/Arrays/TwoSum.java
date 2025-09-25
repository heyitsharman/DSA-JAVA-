package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] sum(int[]arr, int x){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] better(int[] arr, int x){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int moreNeeded = x - num;
            if (mp.containsKey(moreNeeded)) {
                return new int[]{mp.get(moreNeeded), i};
            }
            mp.put(num,i);
        }
        return new int[] {-1,-1};
    }
    public static int[] optimal(int[]arr, int x){
        int left = 0;
        int right = arr.length-1;
        while(left <=right){
            if(arr[left]+arr[right]==x){
                return new int[] {left,right};
            }
            if(arr[left]+arr[right] > x){
                right --;
            }
            if(arr[left] + arr[right] < x){
                left++;
            }

        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        int target = 13;
//        int[] res = sum(arr,target);
//        int[] res = better(arr,target);
        int[] res = optimal(arr,target);
        System.out.print(res[0]+" "+res[1]);
    }
}
