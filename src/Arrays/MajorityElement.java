package Arrays;


import java.util.HashMap;
import java.util.Map;


public class MajorityElement {
    public static int majorityBrute(int[] arr, int n){
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt > n/2){
                return arr[i];
            }
        }

        return -1;
    }
    public static int MajorityBetter(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();


        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // Check if any element has count > n/2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
    public static int MajorityElement(int[] arr, int n){
        int candidate = 0;
        int count = 0;
        for(int i=0; i<n; i++){

            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
            else if(arr[i]==candidate){
                count ++;
            }
            else{
                count --;
            }
        }

        if(count > n/2){
            return candidate;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,1,2,2};
        int n = arr.length;
//        int res = majorityBrute(arr,n);
        int res = MajorityElement(arr,n);
        System.out.println(res);
    }
}
