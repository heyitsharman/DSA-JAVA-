package HashMap;

import java.util.HashMap;
import java.util.List;

public class twoSum {
    public static int[] twosum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] result = twosum(arr,3);
        for(int x: result){
            System.out.print(x+" ");
        }
    }
}
