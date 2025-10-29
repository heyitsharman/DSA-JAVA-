package HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,6,7,8,6};
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(hasDuplicate(arr));
    }
}
