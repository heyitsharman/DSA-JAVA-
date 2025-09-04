package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int K = 3;
//        Brute Force    TC= O(n^3) SC=O(1)
//        int len = 0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i; j<arr.length; j++){
//                int sum = 0;
//                for(int k=i; k<=j; k++){
//                    sum += arr[k];
//
//                }
//                if(sum == K){
//                    len = Math.max(len, j-i+1);
//                }
//            }
//        }
//
//        System.out.println(len);


//        Optimized Brute Force  O(n^2)
//        int len = 0;
//        for(int i=0; i<arr.length; i++){
//            int sum = 0;
//            for(int j=i; j<arr.length; j++){
//
//                sum += arr[j];
//                if(sum == K){
//                    len = Math.max(len, j-i+1);
//                }
//            }
//        }
//
//        System.out.println(len);


        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == K){
                maxLen = i+1;
            }
            if(mp.containsKey(sum-K)){
                maxLen = Math.max(maxLen, i-mp.get(sum-K));
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        System.out.println(maxLen);

    }

}
